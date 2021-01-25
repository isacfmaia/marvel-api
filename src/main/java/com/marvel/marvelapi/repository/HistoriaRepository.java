package com.marvel.marvelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marvel.marvelapi.model.Historia;

@Repository
public interface HistoriaRepository extends JpaRepository<Historia, Integer>{

}
