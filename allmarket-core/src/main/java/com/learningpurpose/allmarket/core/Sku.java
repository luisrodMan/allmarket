package com.learningpurpose.allmarket.core;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Sku implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String value;
	
	public Sku(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return getValue();
	}

}
