package com.movies.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.model.Movie;
import com.movies.service.MovieService;

@Slf4j
@CrossOrigin(origins = "http://localhost:9986", maxAge = 3600)
@RestController
public class MoviesController {


    @Autowired
    private MovieService service;

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> list(){
        log.info("requested movie list.........!");
        return ResponseEntity.ok(service.getMovies());
    }
}
