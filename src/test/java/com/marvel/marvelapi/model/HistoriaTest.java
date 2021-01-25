package com.marvel.marvelapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HistoriaTest {
	
	 @Test
	 public void historiaModel() {
		 Historia historia = new Historia();
		 historia.setId(99);
		 historia.setTitulo("Historia de Teste");
		 
		 assertEquals("Historia de Teste", historia.getTitulo());
		 assertTrue(historia.toString().contains("Historia de Teste"));
	 }
}
