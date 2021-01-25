package com.marvel.marvelapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvel.marvelapi.exception.RegistroNaoEncontradoException;
import com.marvel.marvelapi.model.Evento;
import com.marvel.marvelapi.model.Historia;
import com.marvel.marvelapi.model.Personagem;
import com.marvel.marvelapi.model.Quadrinho;
import com.marvel.marvelapi.model.Serie;
import com.marvel.marvelapi.repository.PersonagemRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Personagem")
@RequestMapping(value="/v1/public/personagens")
@CrossOrigin
public class PersonagemController {

	@Autowired
	private PersonagemRepository personagemRepository;
	
	@GetMapping(produces="application/json")
	@ApiOperation(value = "Retorna todos dos personagens da Marvel-API")
	public List<Personagem> listar(){
		return personagemRepository.findAll();
	}
	
	
	@GetMapping(value = "/{personagemId}", produces="application/json")
	@ApiOperation(value = "Retorna um personagem específico")
	public Optional<Personagem> findPersonagemById(@PathVariable("personagemId") Integer personagemId){

		Optional<Personagem> personagem = personagemRepository.findById(personagemId);
		
		if(!personagem.isPresent()){
			throw new RegistroNaoEncontradoException();
		}
		
		return personagem;
		
	}
	
	
	@GetMapping(value = "/{personagemId}/quadrinhos")
	@ApiOperation(value = "Retorna todos os quadrinhos de um personagem específico")
	public List<Quadrinho> findQuadrinhoByPersonagemId(@PathVariable("personagemId") Integer personagemId){
		
		Optional<Personagem> personagem = personagemRepository.findById(personagemId);
		
		if(!personagem.isPresent()){
			throw new RegistroNaoEncontradoException();
		}
		
		return personagem.get().getQuadrinhos();
	}
	
	@GetMapping(value = "/{personagemId}/series")
	@ApiOperation(value = "Retorna todos as séries de um personagem específico")
	public List<Serie> findSeriesByPersonagemId(@PathVariable("personagemId") Integer personagemId){
		
		Optional<Personagem> personagem = personagemRepository.findById(personagemId);
		
		if(!personagem.isPresent()){
			throw new RegistroNaoEncontradoException();
		}
		
		return personagem.get().getSeries();
	}
	
	@GetMapping(value = "/{personagemId}/historias")
	@ApiOperation(value = "Retorna todos as histórias de um personagem específico")
	public List<Historia> findHistoriasByPersonagemId(@PathVariable("personagemId") Integer personagemId){
		
		Optional<Personagem> personagem = personagemRepository.findById(personagemId);
		
		if(!personagem.isPresent()){
			throw new RegistroNaoEncontradoException();
		}
		
		return personagem.get().getHistorias();
	}
	
	@GetMapping(value = "/{personagemId}/eventos")
	@ApiOperation(value = "Retorna todos os eventos de um personagem específico")
	public List<Evento> findEventoByPersonagemId(@PathVariable("personagemId") Integer personagemId){
		
		Optional<Personagem> personagem = personagemRepository.findById(personagemId);
		
		if(!personagem.isPresent()){
			throw new RegistroNaoEncontradoException();
		}
		
		return personagem.get().getEventos();
	}
}
