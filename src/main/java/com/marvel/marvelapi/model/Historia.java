package com.marvel.marvelapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
public class Historia {
	
	@Id
	@ApiModelProperty(value = "Identificador da história")
	private Integer id;
	
	@ApiModelProperty(value = "Título da história")
	private String titulo;
	
	@ApiModelProperty(value = "Descrição da história")
	private String descricao; 
	
}
