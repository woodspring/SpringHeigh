package woodspring.springheigh.cache;

import java.util.concurrent.ConcurrentSkipListMap;

import lombok.extern.slf4j.Slf4j;
import woodspring.springheigh.model.FxSpotRate;


@Slf4j
public class CacheFxSpotRate {

	private static ConcurrentSkipListMap< String, FxSpotRate> fxSpotRateCache = new ConcurrentSkipListMap< String, FxSpotRate>();
}
