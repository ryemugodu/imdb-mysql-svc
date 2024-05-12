package com.movies.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.movies.model.Movie;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ImdbClient {

	@Autowired
	public RestTemplate restTemplate;
	
	private String url="https://imdb-top-100-movies.p.rapidapi.com/";
	
	public List<Movie> getMovies(){
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Key", "0498186685msh226818ebf4de84bp1f73e3jsna5f70c0609d3");
		headers.set("X-RapidAPI-Host", "imdb-top-100-movies.p.rapidapi.com");
		
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(null, headers);
		ResponseEntity<List> response = restTemplate.exchange(url,HttpMethod.GET, httpEntity, List.class);
		return response.getBody();
	}
}
