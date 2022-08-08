package com.exercise.cicd.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class BeerController {

    @GetMapping("/beers")
    public JsonNode getBeers() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var beers = objectMapper.createArrayNode();
        for (var i = 0; i < 10; i++) {
            var beer = faker.beer();
            beers.add(objectMapper.createObjectNode()
                    .put("name", beer.name())
                    .put("style", beer.style()));
        }

        return beers;
    }
}
