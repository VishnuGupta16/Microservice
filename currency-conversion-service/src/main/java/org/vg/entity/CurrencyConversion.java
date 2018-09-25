package org.vg.entity;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor;
	private BigDecimal amount;
	private BigDecimal convertedAmount;
	private int port;
	
	
	
	public CurrencyConversion() {
		super();
	}

	public CurrencyConversion(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal amount,
			BigDecimal convertedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.amount = amount;
		this.convertedAmount = convertedAmount;
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
	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}
	public void setConvertedAmount(BigDecimal convertedAmount) {
		this.convertedAmount = convertedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
