package com.marvel.marvelapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Miniatura {
	
	@Id
	@JsonIgnore
	private Integer id;
	
	private String path;
	private String extensao;
	
}
