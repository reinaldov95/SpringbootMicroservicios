package com.reinaldo.items.service;

import java.util.List;

import com.reinaldo.items.model.Item;

public interface IItemService {

	public List<Item> findAll();
	
	public Item findById(Long id, int cantidad);
}
