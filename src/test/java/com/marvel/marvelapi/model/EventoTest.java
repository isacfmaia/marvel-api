package com.marvel.marvelapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EventoTest {
	
	 @Test
	 public void eventoModel() {
		 Evento evento = new Evento();
		 evento.setId(99);
		 evento.setTitulo("Evento de Teste");
		 
		 assertEquals("Evento de Teste", evento.getTitulo());
		 assertTrue(evento.toString().contains("Evento de Teste"));
	 }
}
