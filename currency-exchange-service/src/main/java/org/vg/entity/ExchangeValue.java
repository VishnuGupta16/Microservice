package org.vg.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity(name="exchange_value")
public class ExchangeValue {
	
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Column(name="conversion_factor")
	private BigDecimal conversionFactor;
	@JsonInclude
	@Transient
	private int port;
	
	public ExchangeValue() {
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionFactor) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}	
}
