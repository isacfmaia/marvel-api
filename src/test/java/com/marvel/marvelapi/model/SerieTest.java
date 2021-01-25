package com.marvel.marvelapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SerieTest {
	
	 @Test
	 public void serieModel() {
		 Serie serie = new Serie();
		 serie.setId(99);
		 serie.setTitulo("Serie de Teste");
		 
		 assertEquals("Serie de Teste", serie.getTitulo());
		 assertTrue(serie.toString().contains("Serie de Teste"));
	 }
}
