package com.springboot.jpa.postgres.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.InductsForTheDayOutput;
import com.springboot.jpa.postgres.rest.service.RetriveInductsForTheDay;

@RestController
public class InductsForTheDayController {

    @Autowired
    private RetriveInductsForTheDay retriveInductsForTheDay;
    
    @RequestMapping(value = {"/inductsfortheday/{userid}", "/inductsfortheday/{userid}/{sorterid}"}, method = RequestMethod.GET)
    public InductsForTheDayOutput getInductsforthedayByUserId(@PathVariable String userid,@PathVariable Optional<String> sorterid) throws Exception {
    	return retriveInductsForTheDay.getInductsForTheDay(userid,sorterid);
    }
}
