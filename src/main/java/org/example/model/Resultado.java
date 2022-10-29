package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)//Anotacion para ignorarPropiedades no especificadas y que en el JSON si vengan
@JsonInclude(Include.NON_NULL)//Anotacion para no mapear datos que vengan como NULL
public class Resultado {
    @JsonProperty("title")
	private String titulo;
    @JsonProperty("byline")
    private String byline;
    @JsonProperty("abstract")
    private String abs;
    @JsonProperty("url")
    private String urlFoto;
}
