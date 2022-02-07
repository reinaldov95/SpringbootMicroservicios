package com.reinaldo.items.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.reinaldo.items.clientes.ProductoClienteRest;
import com.reinaldo.items.model.Item;

@Service("feignService")
@Primary
public class ItemFeignService implements IItemService {

	@Autowired
	private ProductoClienteRest feignCliente;
	
	@Override
	public List<Item> findAll() {
		return feignCliente.findAll().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, int cantidad) {
		return new Item(feignCliente.findById(id), cantidad);
	}

}
