package com.marvel.marvelapi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
public class Personagem {
	
	@Id
	@ApiModelProperty(value = "Identificador do personagem")
	private Integer id;
	
	@ApiModelProperty(value = "Nome do personagem")
	private String nome;
	
	@ApiModelProperty(value = "Descrição do personagem")
	private String descricao; 
	
	@ApiModelProperty(value = "Data da última alteração do registro")
	private Date alteracao;
	
	@ApiModelProperty(value = "Link para acessar o recurso do personagem")
	private String recursoURI;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MINIATURA", referencedColumnName = "ID")
	private Miniatura miniatura;
	
	@ApiModelProperty(value = "Link para acessar o recurso de quadrinhos do personagem")
	private String quadrinhosURI;

	@ApiModelProperty(value = "Lista de quadrinhos do personagem")
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "PERSONAGEM_QUADRINHO", joinColumns = {@JoinColumn(name = "id_personagem")}, inverseJoinColumns = {@JoinColumn(name = "id_quadrinho")})
	private List<Quadrinho> quadrinhos;
	
	@ApiModelProperty(value = "Link para acessar o recurso de séries do personagem")	
	private String seriesURI;
	
	@ApiModelProperty(value = "Lista de séries do personagem")
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "PERSONAGEM_SERIE", joinColumns = {@JoinColumn(name = "id_personagem")}, inverseJoinColumns = {@JoinColumn(name = "id_serie")})
	private List<Serie> series;
	
	@ApiModelProperty(value = "Link para acessar o recurso de histórias do personagem")
	private String historiasURI;
	
	@ApiModelProperty(value = "Lista de historias do personagem")
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "PERSONAGEM_HISTORIA", joinColumns = {@JoinColumn(name = "id_personagem")}, inverseJoinColumns = {@JoinColumn(name = "id_historia")})
	private List<Historia> historias;	
	
	@ApiModelProperty(value = "Link para acessar o recurso de eventos do personagem")
	private String eventosURI;
	
	@ApiModelProperty(value = "Lista de eventos do personagem")
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "PERSONAGEM_EVENTO", joinColumns = {@JoinColumn(name = "id_personagem")}, inverseJoinColumns = {@JoinColumn(name = "id_evento")})
	private List<Evento> eventos;
}
