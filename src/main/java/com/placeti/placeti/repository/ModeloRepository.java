package com.placeti.placeti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placeti.placeti.model.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

}
