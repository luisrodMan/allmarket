package com.learningpurpose.allmarket.itemservice;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.learningpurpose.allmarket.core.Sku;

@Entity
public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private Sku sku;
	private String name;
	private String mark;
	
	public Item() {
		
	}
	
	public void setSku(Sku sku) {
		this.sku = sku;
	}
	
	public Sku getSku() {
		return sku;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMark() {
		return mark;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}

}
