package org.vg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vg.entity.ExchangeValue;
import org.vg.repository.ExchangeValueRepository;

@RestController
@RequestMapping("/currencyExchange")
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("/from/{from}/to/{to}")
	public ResponseEntity<ExchangeValue> retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>(1);
		headers.add("port", environment.getProperty("local.server.port"));
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return new ResponseEntity<ExchangeValue>(exchangeValue, headers,
				HttpStatus.OK);
	}
}
