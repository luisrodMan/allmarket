package com.learningpurpose.allmarket.itemservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningpurpose.allmarket.core.ResourceNotFoundException;
import com.learningpurpose.allmarket.core.Sku;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	public Item getItem(Sku sku) {
		Optional<Item> data = repository.findById(sku);
		return data.orElseThrow(() -> new ResourceNotFoundException("Item not found: " + sku));
	}
	
	public Item create(Item item) {
		return repository.save(item);
	}
	
	public Item update(Item item) {
		return repository.save(item);
	}
	
	public void delete(Sku sku) {
		repository.deleteById(sku);
	}

}
