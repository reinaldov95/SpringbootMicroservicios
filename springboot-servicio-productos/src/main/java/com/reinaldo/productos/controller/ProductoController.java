package com.reinaldo.productos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinaldo.productos.entity.Producto;
import com.reinaldo.productos.service.IProductoService;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService productoServive;
	
	@GetMapping("/listar")
	public ResponseEntity<?> obtenerProductos(){
		return new ResponseEntity<>(productoServive.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarProductos(@RequestBody Producto producto){
		return new ResponseEntity<>(productoServive.save(producto), HttpStatus.CREATED);
	}

}
