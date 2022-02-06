package com.reinaldo.items.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.reinaldo.items.model.Item;
import com.reinaldo.items.model.Producto;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Item> findAll() {
		
		List<Item> items = new ArrayList<Item>();
		List<Producto> productos = new ArrayList<Producto>();
		productos = Arrays.asList(clienteRest.getForObject("http://localhost:8001/api/productos/listar", Producto[].class));
		for(Producto p: productos) {
			Item item = new Item(p, 1);
			items.add(item);
		}
		return items;
		//return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, int cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Producto producto = clienteRest.getForObject("http://localhost:8001/api/productos/obtener/{id}", Producto.class, pathVariables);
		return new Item(producto, cantidad);
	}

}
