package com.cognizant.jwt.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class CustomUserDetailsService {

    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails user = User.builder()

                .username("paul")

                .password("{noop}12345")

                .roles("USER")

                .build();

        return new InMemoryUserDetailsManager(user);

    }

}