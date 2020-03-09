package com.learningpurpose.allmarket.itemservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learningpurpose.allmarket.core.Sku;

@Repository
public interface ItemRepository extends CrudRepository<Item, Sku> {

}
