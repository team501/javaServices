package com.springboot.jpa.postgres.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.ChuteSummary;
import com.springboot.jpa.postgres.rest.service.RetriveChuteSummary;

@RestController
public class ChuteSummaryController {

    @Autowired
    private RetriveChuteSummary retriveChuteSummary;
    
    @GetMapping("/chutesummary/{userid}")
    public ChuteSummary getChuteSummaryByUserId(@PathVariable String userid) throws Exception {
    	return retriveChuteSummary.getChuteSummary(userid);
    }
}
