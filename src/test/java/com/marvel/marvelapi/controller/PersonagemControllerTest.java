package com.marvel.marvelapi.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.marvel.marvelapi.repository.PersonagemRepository;


@RunWith(SpringRunner.class)
@WebMvcTest(PersonagemController.class)
public class PersonagemControllerTest {

	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private PersonagemRepository personagemRepository;
	
	@Test
	public void acessandoRecursoQueNaoExiste() throws Exception {
		this.mockMvc.perform(get("/v1/public/viloes")).andExpect(MockMvcResultMatchers.status().isNotFound());
	}
	
	
	@Test
	public void listandoPersonagensNoGETdoRecurso() throws Exception {
		this.mockMvc.perform(get("/v1/public/personagens")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
