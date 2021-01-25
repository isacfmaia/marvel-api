package com.marvel.marvelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marvel.marvelapi.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer>{

}
