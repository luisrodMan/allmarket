package com.learningpurpose.allmarket.gateway.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningpurpose.allmarket.core.Sku;

@RestController
@RequestMapping("/item")
@EnableFeignClients
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/{sku}")
	public ItemDetail get(@PathVariable Sku sku) {
		ItemDetail data = new ItemDetail();
		data.setItem(itemService.getItem(sku));
		return data;
	}

}