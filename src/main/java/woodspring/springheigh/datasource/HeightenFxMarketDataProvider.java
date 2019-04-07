package woodspring.springheigh.datasource;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.stereotype.Component;

import woodspring.springheigh.model.FxForwardPoint;
import woodspring.springheigh.model.FxSpotRate;


@Component
public class HeightenFxMarketDataProvider {
	
	
	private static ConcurrentHashMap<String, ArrayList<FxForwardPoint>> fxFwdPointCache; 
	private static ConcurrentSkipListMap< String, FxSpotRate> fxSpotRateCache;
	
	
	
	private static List<FxForwardPoint> grepSwapPointsAndSpotRate(String symbol,  HtmlUnitDriver unitDriver) throws FileNotFoundException, InterruptedException {
//		 List<MarketRawDataVo> all_data = new ArrayList<>();
//		 String formattedSymbol = symbol.toLowerCase();
//		formattedSymbol = formattedSymbol.substring(0, 3) + "-" + formattedSymbol.substring(3,6);
//		// open google.com webpage
//		unitDriver.get("https://ca.investing.com/currencies/" + formattedSymbol + "-forward-rates");
//		Thread.sleep(1000);
//
//       
//		// find the search edit box on the google page
//		WebElement table = unitDriver.findElement(By.id("curr_table"));
//		WebElement tableBody = table.findElement(By.tagName("tbody"));
//		List<WebElement> records = tableBody.findElements(By.tagName("tr"));
//		
//		for ( WebElement row :records) {
//			
//			List<WebElement> elements = row.findElements(By.tagName("td"));
//			String line = elements.get(1).getText();
//			Matcher matcher = pattern.matcher(line);
//			if (matcher.find()) {
//				String bidPoints= elements.get(2).getText();
//				String askPoints= elements.get(3).getText();
//				String tenor = matcher.group(2);
//				
//				if ( "SW".equals(tenor)) {
//					tenor  = "1W";
//				}
//				if ( tenor != null ){
//					all_data.add(new MarketRawDataVo(RawDataType.SWAP_POINTS, symbol, tenor, new BigDecimal(bidPoints).doubleValue(), -1.0d, new BigDecimal(askPoints).doubleValue()));
//				} 
//			}
//		}
//
//		WebElement quotes_summary_secondary_data = unitDriver.findElement(By.id("quotes_summary_secondary_data"));
//		Pattern p = Pattern.compile("Bid/Ask: (\\S+) / (\\S+)");
//		
//		Matcher m = p.matcher(quotes_summary_secondary_data.getText());
//		String bidRate = null, askRate = null;
//		if ( m.find()) {
//			bidRate = m.group(1);
//			askRate = m.group(2);
//		}
//
//		WebElement spotRate = unitDriver.findElement(By.id("last_last"));
//		String spotRateStr = spotRate.getText();
//		all_data.add(new MarketRawDataVo(RawDataType.SPOT_RATE, symbol, new BigDecimal(bidRate).doubleValue(), new BigDecimal(spotRateStr).doubleValue(), new BigDecimal(askRate).doubleValue()));
//		return all_data;
		return new ArrayList<FxForwardPoint>();
	} 

}
