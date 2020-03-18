package com.learningpurpose.allmarket.itemservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningpurpose.allmarket.core.Sku;

@RestController
@RequestMapping("/items")
public class ItemController implements RestItemService {
	
	@Autowired
	private ItemService service;
	
	@GetMapping("/{sku}")
	public Item getItem(@PathVariable Sku sku) {
		return service.getItem(sku);
	}

	@Override
	public Item create(Item item) {
		return service.create(item);
	}

	@Override
	public Item update(Item item) {
		return service.update(item);
	}

	@Override
	public void delete(Sku sku) {
		service.delete(sku);
	}
	
	@Override
	public Item get(Sku sku) {
		return service.getItem(sku);
	}

	@Override
	public List<Item> getAll(String description, String mark, String min, String max) {
		return null;
	}

}
