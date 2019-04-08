package woodspring.springheigh.service;

import java.util.List;



import woodspring.springheigh.model.FxForwardPoint;
import woodspring.springheigh.model.FxSpotRate;

public interface SpringHeighService {
	
	public List<FxSpotRate> getSpotRate();
	public List<FxSpotRate> getSpotRate(String symbol);
	public List<FxForwardPoint> getForwardPoint();
	public List<FxForwardPoint> getForwardPoint(String symbol);
	
}
