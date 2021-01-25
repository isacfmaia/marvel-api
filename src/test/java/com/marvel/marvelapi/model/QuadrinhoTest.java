package com.marvel.marvelapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QuadrinhoTest {
	
	 @Test
	 public void quadrinhoModel() {
		 Quadrinho quadrinho = new Quadrinho();
		 quadrinho.setId(99);
		 quadrinho.setTitulo("Quadrinho de Teste");
		 
		 assertEquals("Quadrinho de Teste", quadrinho.getTitulo());
		 assertTrue(quadrinho.toString().contains("Quadrinho de Teste"));
	 }
}
