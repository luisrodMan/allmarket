package com.learningpurpose.allmarket.gateway.item;

import org.springframework.cloud.openfeign.FeignClient;

import com.learningpurpose.allmarket.itemservice.RestItemService;

@FeignClient("allmarket-itemservice")
public interface ItemService extends RestItemService {
	
}
