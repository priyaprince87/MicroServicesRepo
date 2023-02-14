package com.example.currencyexchange.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.currencyexchange.model.CurrencyExchange;


	@RestController
	public class currencyExchangeController {

		@Autowired
		Environment env;
		
		@GetMapping("/currencyExchange/{from}/To/{to}/")
		public CurrencyExchange getValue(@PathVariable String from, @PathVariable String to ) {
			
			CurrencyExchange c = new CurrencyExchange();
			c.setFrom(from);
			c.setTo(to);
			c.setConversionMultiple(new BigDecimal(76.00));
			c.setEnv(env.getProperty("local.server.port"));
			return c;
		}
	}


