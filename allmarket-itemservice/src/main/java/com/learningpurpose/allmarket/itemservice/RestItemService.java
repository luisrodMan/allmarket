package com.learningpurpose.allmarket.itemservice;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningpurpose.allmarket.core.Sku;

public interface RestItemService {
	
	@PostMapping
	Item create(@RequestBody Item item);
	
	@PutMapping
	Item update(@RequestBody Item item);
	
	@DeleteMapping("/{sku}")
	void delete(@PathVariable("sku") Sku sku);
	
	@GetMapping("/{sku}")
	Item get(@PathVariable("sku") Sku sku);
	
	@GetMapping
	List<Item> getAll(
		@RequestParam(name = "q", defaultValue = "") String description,
		@RequestParam(name = "mark", defaultValue = "") String mark,
		@RequestParam(name = "min", defaultValue = "") String min,
		@RequestParam(name = "max", defaultValue = "") String max
	);

}
