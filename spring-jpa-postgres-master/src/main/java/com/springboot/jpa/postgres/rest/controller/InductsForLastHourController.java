package com.springboot.jpa.postgres.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.InductsForLastHourOutput;
import com.springboot.jpa.postgres.rest.service.RetriveInductsForLastHour;

@CrossOrigin
@RestController
public class InductsForLastHourController {

    @Autowired
    private RetriveInductsForLastHour retriveInductsForLastHour;
    
    @RequestMapping(value = {"/inductsforlasthour/{userid}", "/inductsforlasthour/{userid}/{sorterid}"}, method = RequestMethod.GET)
    public InductsForLastHourOutput getInductsforLastHourByUserId(@PathVariable String userid,@PathVariable Optional<String> sorterid) throws Exception {
    	return retriveInductsForLastHour.getInductsForLastHour(userid,sorterid);
    }    
}
