package com.learningpurpose.allmarket.itemservice;

import com.learningpurpose.allmarket.core.Sku;

public class ItemNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ItemNotFoundException(Sku sku) {
		super(sku.toString());
	}

}
