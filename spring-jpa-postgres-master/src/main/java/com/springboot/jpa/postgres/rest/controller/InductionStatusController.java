package com.springboot.jpa.postgres.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.InductionStatus;
import com.springboot.jpa.postgres.rest.service.RetriveInductionStatus;

@RestController
public class InductionStatusController {

    @Autowired
    private RetriveInductionStatus retriveInductionStatus;
    
    @GetMapping("/inductionstatus/{userid}")
    public List<InductionStatus> getInductionStatusByUserId(@PathVariable String userid) throws Exception {
    	return retriveInductionStatus.getInductionStatus(userid);
    }
}
