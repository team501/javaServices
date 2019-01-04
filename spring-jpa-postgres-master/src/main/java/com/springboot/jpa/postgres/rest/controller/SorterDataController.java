package com.springboot.jpa.postgres.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.SorterData;
import com.springboot.jpa.postgres.rest.service.RetriveSorterData;

@RestController
public class SorterDataController {

    @Autowired
    private RetriveSorterData retriveSorterData;
    
    @GetMapping("/sorterdata/{userid}")
    public SorterData getSorterDataByUserId(@PathVariable String userid) throws Exception {
    	return retriveSorterData.getSorterData(userid);
    }
}
