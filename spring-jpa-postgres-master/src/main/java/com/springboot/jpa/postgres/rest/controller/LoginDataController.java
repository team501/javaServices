package com.springboot.jpa.postgres.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.LoginData;
import com.springboot.jpa.postgres.rest.service.RetriveLoginData;

@RestController
public class LoginDataController {
	
    @Autowired
    private RetriveLoginData letriveLoginData;
    
    @GetMapping("/login/{username}")
    public LoginData getLoginDataByUserName(@PathVariable String username) throws Exception {
    	return letriveLoginData.getLoginData(username);
    }
}
