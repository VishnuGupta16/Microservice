package org.vg.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vg.entity.CurrencyConversion;
import org.vg.feign.proxy.CurrencyExchangeProxy;
import org.vg.utility.Util;

@RestController
@RequestMapping("/currency-converter")
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy currencyExchangeProxy;
	
	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/from/{from}/to/{to}/amount/{amount}")
	public ResponseEntity<CurrencyConversion> covertConversion(@PathVariable String from,
			@PathVariable String to, @PathVariable BigDecimal amount){
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		CurrencyConversion conversion = currencyExchangeProxy.retriveExchangeValue(from, to);
		conversion.setConvertedAmount(amount.multiply(conversion.getConversionFactor()));
		conversion.setAmount(amount);
		LOG.info("request -.{}", getRequest());
		return new ResponseEntity<CurrencyConversion>(conversion, headers, HttpStatus.OK);
	}
	
	
	private HttpServletRequest getRequest() {
		return Util.getCurrentHttpRequest();
	}
	
}
