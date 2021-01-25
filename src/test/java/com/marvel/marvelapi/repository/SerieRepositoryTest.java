package com.marvel.marvelapi.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.marvel.marvelapi.model.Serie;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class SerieRepositoryTest {

	@Autowired
    private SerieRepository serieRepository;
	
	@Test
	public void buscandoSeriePorId() {
		Optional<Serie> serie = serieRepository.findById(1);
		assertTrue(serie.isPresent());
	}
	
	@Test
	public void buscandoTodosAsSeries() {
		List<Serie> series = serieRepository.findAll();
		assertTrue(!series.isEmpty());
	}
	
}
