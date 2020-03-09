package com.learningpurpose.allmarket.itemservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningpurpose.allmarket.core.Sku;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	public Item getItem(Sku sku) {
		Optional<Item> data = repository.findById(sku);
		return data.isPresent() ? data.get() : null;
	}

}
