package woodspring.springheigh.util;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Supplier;

public class SpringReadWriteLock {
	
	private final Lock readLock;
	private final Lock writeLock;
	
	public SpringReadWriteLock() {
		this( new ReentrantReadWriteLock());
	}
	
	public SpringReadWriteLock(ReentrantReadWriteLock lock_) {
		readLock = lock_.readLock();
		writeLock = lock_.writeLock();
	}
	
	public <T> T read(Supplier<T> block) {
		readLock.lock();
		try {
			return block.get();
		} finally {
			readLock.unlock();
		}
	}
	
	public void read(Runnable block) {
		readLock.lock();
		try {
			block.run();
		} finally {
			readLock.unlock();
		}
	}
	
	public <T> T read( Callable<T> block) {
		readLock.lock();
		try {
			return block.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			readLock.unlock();
		}
		return null;
	}

	public <T> T write(Supplier<T> block) {
		writeLock.lock();
		try {
			return block.get();
		} finally {
			writeLock.unlock();
		}
	}
	
	public void write(Runnable block) {
		readLock.lock();
		try {
			block.run();
		} finally {
			writeLock.unlock();
		}
	}
	
	public <T> T write( Callable<T> block) {
		readLock.lock();
		try {
			return block.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writeLock.unlock();
		}
		return null;
	}
}
