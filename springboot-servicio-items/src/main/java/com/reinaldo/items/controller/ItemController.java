package com.reinaldo.items.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinaldo.items.service.IItemService;

@RestController
@RequestMapping("api/items")
public class ItemController {
	
	@Autowired
	private IItemService itemService;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		return new ResponseEntity<>(itemService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/item/{id}/cantidad/{cantidad}")
	public ResponseEntity<?> buscarItem(@PathVariable Long id, @PathVariable int cantidad){
		return new ResponseEntity<>(itemService.findById(id, cantidad), HttpStatus.OK);
	}

}
