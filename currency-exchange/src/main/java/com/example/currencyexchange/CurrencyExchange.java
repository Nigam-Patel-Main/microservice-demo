package com.example.currencyexchange;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {

	@Id
	private Long id;
	
	@Column(name = "from_currency")
	private String from;
	
	@Column(name = "to_currency")
	private String to;
	
	private Integer multiplyValue;
	private String identity;
	
	public CurrencyExchange(){
	}
	
	public CurrencyExchange(Long id, String from, String to, Integer multiplyValue, String identity) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiplyValue = multiplyValue;
		this.identity = identity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Integer getMultiplyValue() {
		return multiplyValue;
	}

	public void setMultiplyValue(Integer multiplyValue) {
		this.multiplyValue = multiplyValue;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", multiplyValue=" + multiplyValue
				+ ", identity=" + identity + "]";
	}
}
