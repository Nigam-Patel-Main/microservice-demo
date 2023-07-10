package com.example.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange")
@Component
public interface CurrencyExchangeProxy {

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion exchangeService(@PathVariable String from, @PathVariable String to);
}
