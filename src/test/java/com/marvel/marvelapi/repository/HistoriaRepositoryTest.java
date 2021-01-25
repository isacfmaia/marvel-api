package com.marvel.marvelapi.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.marvel.marvelapi.model.Historia;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class HistoriaRepositoryTest {

	@Autowired
    private HistoriaRepository historiaRepository;
	
	@Test
	public void buscandoHistoriaPorId() {
		Optional<Historia> historia = historiaRepository.findById(1);
		assertTrue(historia.isPresent());
	}
	
	@Test
	public void buscandoTodasAsHistorias() {
		List<Historia> historias = historiaRepository.findAll();
		assertTrue(!historias.isEmpty());
	}
	
}
