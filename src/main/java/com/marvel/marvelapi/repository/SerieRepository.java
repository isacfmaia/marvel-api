package com.marvel.marvelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marvel.marvelapi.model.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer>{

}
