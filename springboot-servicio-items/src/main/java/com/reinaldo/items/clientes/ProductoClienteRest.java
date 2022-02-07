package com.reinaldo.items.clientes;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.reinaldo.items.model.Producto;

@FeignClient(name="servicio-productos", url="localhost:8001/api/productos")
public interface ProductoClienteRest {
	
	@GetMapping("/listar")
	public List<Producto> findAll();
	
	@GetMapping("/obtener/{id}")
	public Producto findById(@PathVariable Long id);

}
