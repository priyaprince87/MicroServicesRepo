package com.slg.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slg.microservices.limitsservice.Configuration.appConfig;
import com.slg.microservices.limitsservice.model.limits;

@RestController
public class limitsController {

	@Autowired
	private appConfig config;
	
	@GetMapping("/limits")
	public limits getLimits(){
		limits l = new limits();
		l.setMinimum(config.getMinimum());
		l.setMaximum(config.getMaximum());
		return l;
	}
}

