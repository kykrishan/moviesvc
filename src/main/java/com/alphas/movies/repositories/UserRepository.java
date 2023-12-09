package com.alphas.movies.repositories;

import com.alphas.movies.types.UserLoginInfo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserLoginInfo, ObjectId> {

}
