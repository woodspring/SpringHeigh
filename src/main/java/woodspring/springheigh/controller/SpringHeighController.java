package woodspring.springheigh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import woodspring.springheigh.model.FxSpotRate;
import woodspring.springheigh.service.SpringHeighService;

@RestController
@RequestMapping("/FX")
@Slf4j
public class SpringHeighController {
	
	@Autowired
	private SpringHeighService springHeighService;
	
	@GetMapping("SPOTRATE/all")
	public List<FxSpotRate> getSpotRate() {
		
		return null;
	}
	
	@GetMapping("SPOTRATE/{symbol}")
	public List<FxSpotRate> getSpotRate(String symbol) {
		
		return null;
	}
	
	
	
	@GetMapping("FORWARDPOINT/{symbol}")
	public List<FxSpotRate> getForwardPoint(String symbol) {
		
		return null;
	}

}
