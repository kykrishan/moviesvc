package com.alphas.movies.security;

import com.alphas.movies.services.UserLoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity
public class SecurityConfig {

//    @Autowired
//    UserLoginInfoService userService;
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }


//    @Bean
//    public AuthenticationManager authenticationManager (AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        return authenticationManagerBuilder.inMemoryAuthentication().withUser("krishan")
//                .password("password").roles(("users"))
//        return authenticationManagerBuilder.userDetailsService(userService).passwordEncoder(passwordEncoder());
//    }


}