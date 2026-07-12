package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {

        Country country = new Country();

        country.setCode("IN");

        country.setName("India");

        return country;

    }

}