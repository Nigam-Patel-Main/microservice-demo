package com.example.currencyconversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	CurrencyExchangeProxy currencyExchangeProxy;
	
	@GetMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion currencyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable Integer quantity) {
		CurrencyConversion conversion = currencyExchangeProxy.exchangeService(from, to);
		return new CurrencyConversion(conversion.getId(), from, to, conversion.getMultiplyValue(), conversion.getIdentity(), quantity, quantity * conversion.getMultiplyValue());
	}
}
