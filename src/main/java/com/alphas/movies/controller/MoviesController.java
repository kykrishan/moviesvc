package com.alphas.movies.controller;

import com.alphas.movies.security.Rules;
import com.alphas.movies.services.MovieService;
import com.alphas.movies.types.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private Rules rules;

    @GetMapping(value = "/allMovies")
    public ResponseEntity<List<Movie>> test(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

}
