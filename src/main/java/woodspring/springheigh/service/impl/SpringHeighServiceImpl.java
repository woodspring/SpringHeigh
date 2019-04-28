package woodspring.springheigh.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import woodspring.springheigh.constants.FxConstant;
import woodspring.springheigh.datasource.HeightenFxMarketDataProvider;
import woodspring.springheigh.model.FxForwardPoint;
import woodspring.springheigh.model.FxSpotRate;
import woodspring.springheigh.service.SpringHeighService;


@Service
public class SpringHeighServiceImpl implements SpringHeighService {

	@Autowired
	HeightenFxMarketDataProvider fxMarketData;
	
	@Override
	public List<FxSpotRate> getSpotRate() {
//		
//		Arrays.asList( FxConstant.symbols2).stream()
//		.map((Function<? super String, ? extends R>) symbol -> {
//				CompletableFuture.supplyAsync( () -> {
//						fxMarketData.getFxSpotRate( symbol);
//						})
//					.thenApply( item -> {
//						return item.get();
//						});
//		})
//		.collect( Collectors.toList());
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FxSpotRate> getSpotRate(String symbol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FxForwardPoint> getForwardPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FxForwardPoint> getForwardPoint(String symbol) {
		// TODO Auto-generated method stub
		return null;
	}

}
