package com.learningpurpose.allmarket.itemservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learningpurpose.allmarket.core.Sku;

@RestController
//@RequestMapping("/item")
public class Controller {
	
	@Autowired
	private ItemService service;
	
	@GetMapping("/{sku}")
	public Item get(@PathVariable Sku sku) {
		Item item = service.getItem(sku);
		if (item == null)
			throw new ItemNotFoundException(sku);
		return item;
	}

}
