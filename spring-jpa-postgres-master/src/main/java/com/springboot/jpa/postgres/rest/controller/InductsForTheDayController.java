package com.springboot.jpa.postgres.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.InductsForTheDayOutput;
import com.springboot.jpa.postgres.rest.service.RetriveInductsForTheDay;

@RestController
public class InductsForTheDayController {

    @Autowired
    private RetriveInductsForTheDay retriveInductsForTheDay;
    
    @GetMapping("/inductsfortheday/{userid}")
    public InductsForTheDayOutput getInductsforthedayByUserId(@PathVariable String userid) throws Exception {
    	return retriveInductsForTheDay.getInductsForTheDay(userid);
    }
}
