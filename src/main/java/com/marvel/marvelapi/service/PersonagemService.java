package com.marvel.marvelapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marvel.marvelapi.model.Personagem;

@Service
public class PersonagemService {

	public List<Personagem> criandoMockPersonagem(Integer quantos){
		
		List<Personagem> personagens = new ArrayList<Personagem>();
		
		for (Integer j = 0; j < quantos; j++) {
			
			Personagem personagem = new Personagem();
			personagem.setId(j);
			personagem.setNome("Personagem " + j.toString());
			
			personagens.add(personagem);
		}
		
		return personagens;
	}
}
