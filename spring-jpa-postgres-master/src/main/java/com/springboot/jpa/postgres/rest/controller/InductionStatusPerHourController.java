package com.springboot.jpa.postgres.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.InductionStatusPerHour;
import com.springboot.jpa.postgres.rest.service.RetriveInductionStatusPerHour;

@CrossOrigin
@RestController
public class InductionStatusPerHourController {
	
    @Autowired
    private RetriveInductionStatusPerHour retriveInductionStatusPerHour;
    
    @GetMapping("/inductionstatusperhour/{userid}/{sorterid}")
    public InductionStatusPerHour getLoginDataByUserName(@PathVariable String userid, @PathVariable String sorterid) throws Exception {
    	return retriveInductionStatusPerHour.getInductionStatusPerHour(userid, sorterid);
    }
}
