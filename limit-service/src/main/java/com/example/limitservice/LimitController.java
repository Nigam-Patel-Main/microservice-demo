package com.example.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	
	@Autowired
	LimitConfig limitConfig;
	
	@GetMapping("limit")
	public Limit getLimit() {
		return new Limit(limitConfig.getMin(), limitConfig.getMax());
	}
}
