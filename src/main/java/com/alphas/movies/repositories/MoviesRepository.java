package com.alphas.movies.repositories;

import com.alphas.movies.types.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends MongoRepository<Movie, ObjectId> {

}
