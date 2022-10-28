package org.example;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    //Link de la API
    public static final String URL_API="https://api.nytimes.com/svc/topstories/v2/world.json?api-key=Lz8GjVMyE78YPMKThm3ymLDpQVwxIWHf";
    public static void main( String[] args ) throws IOException, InterruptedException {
        //Haciendo la peticion a la API
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .GET()
                .header("accept","aplication/json")
                .uri(URI.create(URL_API))
                .build();

        HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


        //Parseo a Json usando JACKSON
        ObjectMapper mapper= new ObjectMapper();
        List<Noticia> noticias= mapper.readValue(response.body(), new TypeReference<List<Noticia>>(){});

        //Mostrando en consola
        noticias.forEach(System.out::println);

    }
}
