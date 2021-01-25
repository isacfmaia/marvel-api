package com.marvel.marvelapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonagemTest {
	
	 @Test
	 public void personagemModel() {
		 Personagem personagem = new Personagem();
		 personagem.setId(99);
		 personagem.setNome("Personagem de Teste");
		 
		 assertEquals("Personagem de Teste", personagem.getNome());
		 assertTrue(personagem.toString().contains("Personagem de Teste"));
	 }
}
