package woodspring.springheigh.cache;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import lombok.extern.slf4j.Slf4j;
import woodspring.springheigh.model.FxForwardPoint;

@Slf4j
public class CacheFxForwardPoint {
	private static ConcurrentHashMap<String, ArrayList<FxForwardPoint>> fxFwdPointCache = new ConcurrentHashMap<String, ArrayList<FxForwardPoint>>();

	static ReadWriteLock rwLock = new ReentrantReadWriteLock();

	public static ArrayList<FxForwardPoint> getFxFwdPointCache(String symbol) {
		rwLock.readLock().lock();
		try {
			if (fxFwdPointCache.containsKey(symbol)) {
				return fxFwdPointCache.get(symbol);
			}
		} catch (Exception ex) {
			log.error("Eception:" + ex.toString());

		} finally {
			rwLock.readLock().unlock();
		}
		return null;
	}

	public static void setFxFwdPoint(String symbol, FxForwardPoint fxFwdPoint) {
		log.info("setFxFwdPoint start:" + symbol);
		ArrayList<FxForwardPoint> fwdPointList = null;
		rwLock.readLock().lock();
		try {
			if (fxFwdPointCache.containsKey(symbol)) {
				fwdPointList = fxFwdPointCache.get(symbol);
				if (fxFwdPoint == null) {
					log.error(symbol + " fxForwardPoint is null");
					return;
				}
				fwdPointList.add(fxFwdPoint);

			} else {
				if (fxFwdPoint == null) {
					log.error(symbol + " fxForwardPoint is null");
					return;
				}
				fwdPointList = new ArrayList<FxForwardPoint>();
				fwdPointList.add(fxFwdPoint);

			}
		} catch (Exception ex) {
			log.error("Eception:" + ex.toString());

		} finally {
			rwLock.readLock().unlock();
		}

		fxFwdPointCache.put(symbol, fwdPointList);
		log.info("setFxFwdPoint end:" + symbol);
	}

	public static void setFxFwdPointList(String symbol, ArrayList<FxForwardPoint> fxFwdPointList) {
		log.info("setFxFwdPointList start:" + symbol);
		rwLock.writeLock().lock();
		try {
			if (fxFwdPointCache.containsKey(symbol)) {
				fxFwdPointCache.remove(symbol);
				fxFwdPointCache.put(symbol, fxFwdPointList);
			} else {
				fxFwdPointCache.put(symbol, fxFwdPointList);
			}
		} catch (Exception ex) {
			log.error("setFxFwdPointCache, " + symbol + " Eception:" + ex.toString());
		} finally {
			rwLock.writeLock().unlock();
		}
		log.info("setFxFwdPointList end:" + symbol);
	}

}
