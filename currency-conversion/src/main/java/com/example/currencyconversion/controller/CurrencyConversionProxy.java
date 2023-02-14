package com.example.currencyconversion.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.currencyconversion.model.currencyConversion;


@FeignClient(name="currency-exchange", url="localhost:8100")
public interface CurrencyConversionProxy {

	
	@GetMapping("/currencyExchange/{from}/To/{to}/")
	public currencyConversion getexchangeRate(@PathVariable String from, @PathVariable String to);
}
