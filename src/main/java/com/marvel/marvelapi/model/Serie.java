package com.marvel.marvelapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
public class Serie {
	
	@Id
	@ApiModelProperty(value = "Identificador da série")
	private Integer id;
	
	@ApiModelProperty(value = "Título da série")
	private String titulo;
	
	@ApiModelProperty(value = "Descrição da série")
	private String descricao; 
	
}
