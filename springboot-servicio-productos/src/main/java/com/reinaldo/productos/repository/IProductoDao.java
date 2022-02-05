package com.reinaldo.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinaldo.productos.entity.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long> {

}
