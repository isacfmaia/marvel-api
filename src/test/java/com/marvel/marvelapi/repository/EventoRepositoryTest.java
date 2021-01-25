package com.marvel.marvelapi.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.marvel.marvelapi.model.Evento;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class EventoRepositoryTest {

	@Autowired
    private EventoRepository eventoRepository;
	
	@Test
	public void buscandoEventoPorId() {
		Optional<Evento> evento = eventoRepository.findById(1);
		assertTrue(evento.isPresent());
	}
	
	@Test
	public void buscandoTodosOsEventos() {
		List<Evento> eventos = eventoRepository.findAll();
		assertTrue(!eventos.isEmpty());
	}
	
}
