package com.marvel.marvelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marvel.marvelapi.model.Quadrinho;

@Repository
public interface QuadrinhoRepository extends JpaRepository<Quadrinho, Integer>{

}
