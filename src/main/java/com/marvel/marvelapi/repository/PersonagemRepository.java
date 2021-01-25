package com.marvel.marvelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marvel.marvelapi.model.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {

}
