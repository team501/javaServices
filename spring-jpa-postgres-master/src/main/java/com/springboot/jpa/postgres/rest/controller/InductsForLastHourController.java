package com.springboot.jpa.postgres.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.InductsForLastHourOutput;
import com.springboot.jpa.postgres.rest.service.RetriveInductsForLastHour;

@RestController
public class InductsForLastHourController {

    @Autowired
    private RetriveInductsForLastHour retriveInductsForLastHour;
    
    @GetMapping("/inductsforlasthour/{userid}")
    public InductsForLastHourOutput getInductsforLastHourByUserId(@PathVariable String userid) throws Exception {
    	return retriveInductsForLastHour.getInductsForLastHour(userid);
    }
}
