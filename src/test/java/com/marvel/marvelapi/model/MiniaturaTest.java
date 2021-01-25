package com.marvel.marvelapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MiniaturaTest {
	
	 @Test
	 public void miniaturaModel() {
		 Miniatura miniatura = new Miniatura();
		 miniatura.setId(99);
		 miniatura.setPath("Path de Teste");
		 
		 assertEquals("Path de Teste", miniatura.getPath());
		 assertTrue(miniatura.toString().contains("Path de Teste"));
	 }
}
