package org.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)//Anotacion para ignorarPropiedades no especificadas y que en el JSON si vengan
@JsonInclude(Include.NON_NULL)//Anotacion para no mapear datos que vengan como NULL
public class GetTopStories {
	
	@JsonProperty("results")
	private List<Resultado> results;
	
}
