package com.example.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "limit-service")
@Component
public class LimitConfig {

	private Integer min;
	private Integer max;

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "LimitConfig [min=" + min + ", max=" + max + "]";
	}
}
