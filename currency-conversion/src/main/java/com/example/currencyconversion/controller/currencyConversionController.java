package com.example.currencyconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.currencyconversion.model.currencyConversion;

@RestController
public class currencyConversionController {

	@Autowired
	Environment env;
	
	@Autowired
	private CurrencyConversionProxy cur;
	
	@GetMapping("/currencyConversion/{from}/To/{to}/quantity/{quan}")
	public currencyConversion getValue(@PathVariable String from, @PathVariable String to, @PathVariable int quan ) {
		
		currencyConversion c = new currencyConversion();
		c.setFrom(from);
		c.setTo(to);
		c.setQuantity(quan);
		currencyConversion c1 = cur.getexchangeRate("usd", "inr");
		c.setConversionMultiple(c1.getConversionMultiple());
		c.setEnv(env.getProperty("local.server.port"));
		return c;
	}
}
