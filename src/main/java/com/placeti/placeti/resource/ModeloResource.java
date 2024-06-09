package com.placeti.placeti.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.placeti.placeti.model.Marca;
import com.placeti.placeti.model.Modelo;
import com.placeti.placeti.service.ModeloService;

@RestController
@RequestMapping("/modelo")
public class ModeloResource {
	
	@Autowired
	private ModeloService modeloService;
	
	@GetMapping
	public Modelo get(@PathVariable Long id) {
		return modeloService.recuperar(id);
	}

	@PostMapping
	public Modelo post(@RequestBody Modelo modelo) {
		return modeloService.criar(modelo);
	
	}
	
	@PutMapping
	public Modelo put(@PathVariable Long id, @RequestBody Modelo modelo) {
		return modeloService.atualizar(id, modelo);
	}
	
	@DeleteMapping
	public void delete(@PathVariable Long id) {
		modeloService.deletar(id);
	}
	
	

}
