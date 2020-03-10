package com.learningpurpose.allmarket.itemservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learningpurpose.allmarket.core.Sku;

public interface RestItemService {
	
	@GetMapping("/{sku}")
	Item getItem(@PathVariable("sku") Sku sku);

}
