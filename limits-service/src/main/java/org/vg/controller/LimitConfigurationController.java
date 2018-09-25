package org.vg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vg.config.Configurations;
import org.vg.entity.LimitsConfiguration;

@RestController
@RequestMapping("/limits")
public class LimitConfigurationController {

	@Autowired
	private Configurations config;
	
	@GetMapping()
	public ResponseEntity<LimitsConfiguration> getLimits() {
		return new ResponseEntity<LimitsConfiguration>(new LimitsConfiguration(config.getMax(), config.getMin()), HttpStatus.OK);
	}
	
}
