package com.springboot.jpa.postgres.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.ChuteDetails;
import com.springboot.jpa.postgres.rest.service.RetriveChuteDetails;

@RestController
public class ChuteDetailsController {

    @Autowired
    private RetriveChuteDetails retriveChuteDetails;
    
    @GetMapping("/chutedetails/{userid}")
    public List<ChuteDetails> getChuteDetailsByUserId(@PathVariable String userid) throws Exception {
    	return retriveChuteDetails.getChuteDetails(userid);
    }
}
