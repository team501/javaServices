package com.springboot.jpa.postgres.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.WaveStatusToday;
import com.springboot.jpa.postgres.rest.service.RetriveWaveStatusToday;

@CrossOrigin
@RestController
public class WaveStatusTodayController {

    @Autowired
    private RetriveWaveStatusToday retriveWaveStatusToday;
    
    @GetMapping("/wavestatustoday/{username}")
    public WaveStatusToday getWaveStatusTodayByUserId(@PathVariable String username) throws Exception {
    	return retriveWaveStatusToday.getWaveStatusToday(username);
    }
}
