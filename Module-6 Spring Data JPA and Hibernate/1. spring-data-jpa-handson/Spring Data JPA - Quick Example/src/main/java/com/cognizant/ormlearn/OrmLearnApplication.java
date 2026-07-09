package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication
        implements CommandLineRunner {

    @Autowired
    private CountryRepository
            repository;

    @Autowired
    private CountryService
            countryService;

    public static void main(
            String[] args) {

        SpringApplication.run(
                OrmLearnApplication.class,
                args);
    }

    @Override
    public void run(
            String... args)
            throws Exception {

        repository.save(
                new Country(
                        "IN",
                        "India"));

        repository.save(
                new Country(
                        "US",
                        "United States"));

        List<Country>
                countries =

            countryService
                .getAllCountries();

        System.out.println(
                countries);
    }
}