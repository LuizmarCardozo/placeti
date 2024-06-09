package com.placeti.placeti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placeti.placeti.model.Modelo;
import com.placeti.placeti.repository.ModeloRepository;

@Service
public class ModeloServiceImpl implements ModeloService {

	@Autowired
	private ModeloRepository modeloRepository;
	
	@Override
	public List<Modelo> recuperar() {
		return modeloRepository.findAll();
	}

	@Override
	public Modelo recuperar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modelo criar(Modelo modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modelo atualizar(Long id, Modelo modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
