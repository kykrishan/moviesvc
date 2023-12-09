package com.alphas.movies.services;

import com.alphas.movies.repositories.UserRepository;
import com.alphas.movies.types.UserLoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Document
public class UserLoginInfoService {

    @Autowired
    private UserRepository userRepository;

//    public UserLoginInfo getUser(){
//        return userRepository.findOne()
//    }
    public List<UserLoginInfo> allMovies(){
        return userRepository.findAll();
    }
}
