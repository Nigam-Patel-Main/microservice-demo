package com.example.currencyconversion;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private Integer multiplyValue;
	private String identity;

	private Integer quantity;
	private Integer total;
	
	public CurrencyConversion() {
		
	}

	public CurrencyConversion(Long id, String from, String to, Integer multiplyValue, String identity, Integer quantity,
			Integer total) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiplyValue = multiplyValue;
		this.identity = identity;
		this.quantity = quantity;
		this.total = total;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", multiplyValue=" + multiplyValue
				+ ", identity=" + identity + ", quantity=" + quantity + ", total=" + total + "]";
	}
}
