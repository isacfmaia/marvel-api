package com.marvel.marvelapi.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.marvel.marvelapi.model.Personagem;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class PersonagemRepositoryTest {

	@Autowired
    private PersonagemRepository personagemRepository;
	
	@Test
	public void buscandoPersonagemPorId() {
		Optional<Personagem> personagem = personagemRepository.findById(1);
		assertTrue(personagem.isPresent());
	}
	
	@Test
	public void buscandoTodosOsPersonagens() {
		List<Personagem> personagens = personagemRepository.findAll();
		assertTrue(!personagens.isEmpty());
	}
	
}
