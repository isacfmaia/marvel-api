package com.marvel.marvelapi.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.marvel.marvelapi.model.Quadrinho;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class QuadrinhoRepositoryTest {

	@Autowired
    private QuadrinhoRepository quadrinhoRepository;
	
	@Test
	public void buscandoQuadrinhoPorId() {
		Optional<Quadrinho> quadrinho = quadrinhoRepository.findById(1);
		assertTrue(quadrinho.isPresent());
	}
	
	@Test
	public void buscandoTodosOsQuadrinhos() {
		List<Quadrinho> quadrinhos = quadrinhoRepository.findAll();
		assertTrue(!quadrinhos.isEmpty());
	}
	
}
