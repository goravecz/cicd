package com.exercise.cicd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BeerControllerTest {

    @Autowired
    public BeerController beerController;

    @Test
    void numberOfBeers() {
        assertEquals(10, beerController.getBeers().size());
    }
}
