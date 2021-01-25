package com.marvel.marvelapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
public class Evento {
	
	@Id
	@ApiModelProperty(value = "Identificador do evento")
	private Integer id;
	
	@ApiModelProperty(value = "Título do evento")
	private String titulo;
	
	@ApiModelProperty(value = "Descrição do evento")
	private String descricao; 
	
}
