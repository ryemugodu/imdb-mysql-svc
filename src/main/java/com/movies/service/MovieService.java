package com.movies.service;

import java.util.List;

import com.movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.client.ImdbClient;
import com.movies.model.Movie;

@Service
public class MovieService {
	@Autowired
	public ImdbClient client;

	@Autowired
	MoviesRepository repository;
	
	public List<Movie> getMovies(){
		List<Movie> list = client.getMovies();
		repository.saveAll(list);
		return list;
	}

}
