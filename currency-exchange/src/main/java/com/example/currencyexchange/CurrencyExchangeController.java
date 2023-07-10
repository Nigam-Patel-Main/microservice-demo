package com.example.currencyexchange;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeRepo currencyExchangeRepo;
	
	@Autowired
	Environment environment;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange exchangeService(@PathVariable String from, @PathVariable String to) {
		CurrencyExchange currencyExchange = currencyExchangeRepo.findByFromAndTo(from,to);
		String port = environment.getProperty("server.port");
		return new CurrencyExchange(currencyExchange.getId(), from, to, currencyExchange.getMultiplyValue(), port+" port");
	}
	
	@PostConstruct
	public void name() {
		currencyExchangeRepo.save(new CurrencyExchange(1001l, "USD", "INR", 70, null));
		currencyExchangeRepo.save(new CurrencyExchange(1002l, "EUR", "INR", 90, null));
	}
}
