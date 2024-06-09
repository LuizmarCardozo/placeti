package com.placeti.placeti.service;

import java.util.List;

import com.placeti.placeti.model.Modelo;

public interface ModeloService {
	
	List<Modelo> recuperar();

	Modelo recuperar(Long id);

	Modelo criar(Modelo modelo);

	Modelo atualizar(Long id, Modelo modelo);

	void deletar(Long id);

}
