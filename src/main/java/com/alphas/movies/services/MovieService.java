package com.alphas.movies.services;

import com.alphas.movies.repositories.MoviesRepository;
import com.alphas.movies.types.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movie> allMovies(){
       return moviesRepository.findAll();
    }
}
