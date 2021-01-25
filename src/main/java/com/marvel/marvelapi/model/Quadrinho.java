package com.marvel.marvelapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
public class Quadrinho {
	
	@Id
	@ApiModelProperty(value = "Identificador do quadrinho")
	private Integer id;
	
	@ApiModelProperty(value = "Título do quadrinho")
	private String titulo;
	
	@ApiModelProperty(value = "Descrição do quadrinho")
	private String descricao;
	
	@ApiModelProperty(value = "Data de lançamento do quadrinho")
	@Temporal(TemporalType.DATE)
	private Date data;
	
}
