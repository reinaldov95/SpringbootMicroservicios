package com.reinaldo.productos.service;

import java.util.List;

import com.reinaldo.productos.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	
	public Producto findById(Long id);
	
	public Producto save(Producto producto);

}
