package woodspring.springheigh.constants;

import java.util.regex.Pattern;

public class FxConstant {

	
	public static final Pattern pattern = Pattern.compile("(\\S{6}) (\\S{2}) FWD");
//	public static final String[] symbols= new String[] { "USDTRY", "EURUSD", "EURTRY"}; 
	public static final String[] symbols1= new String[] { 
			"AUDUSD", 
			"NZDUSD", 
			"CHFUSD",
			"USDKRW", "USDRUB", "USDCAD", "USDJPY", "USDNOK", "USDSGD", "USDTRY",
			"EURUSD", "EURTRY", "EURJPY", "EURCHF", "EURGBP", "EURNZD", "EURCAD", "EURNOK",
			"GBPUSD", "GBPCAD", "GBPTRY", "GBPCHF", "GBPJPY" 
	}; 
	public static final String[] symbols2 = new String[] { "USDCAD", "USDJPY", "USDCHF", "USDNOK", "USDSEK", "AUDUSD",
			"NZDUSD", "AUDCHF", "AUDJPY", "CHFJPY", "CHFNOK", "EURUSD", "EURCAD", "EURCHF", "EURGBP", "EURJPY",
			"EURNOK", "EURSEK", "GBPUSD", "GBPCAD", "GBPNOK", "GBPSEK", "NOKJPY", "SEKJPY", "NZDCAD", "NZDJPY", "NZDNOK",
			"NZDSEK", "USDTRY", "EURTRY", "GBPTRY", "USDZAR", "USDKRW"
	};
	
	
}
