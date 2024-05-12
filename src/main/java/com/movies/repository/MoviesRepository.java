package com.movies.repository;

import com.movies.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<Movie, String> {
}
