package com.reinaldo.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reinaldo.productos.entity.Producto;
import com.reinaldo.productos.repository.IProductoDao;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoDao productoDao; 
	
	@Override
	public List<Producto> findAll() {
		return productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return productoDao.findById(id).get();
	}

	@Override
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

}
