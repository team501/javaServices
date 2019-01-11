package com.springboot.jpa.postgres.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.postgres.rest.model.CreateLoginDataOutput;
import com.springboot.jpa.postgres.rest.model.LoginData;
import com.springboot.jpa.postgres.rest.service.RetriveLoginData;

@CrossOrigin
@RestController
public class LoginDataController {
	
    @Autowired
    private RetriveLoginData letriveLoginData;
    
    @PostMapping("/login")
    public CreateLoginDataOutput getLoginData(@Valid @RequestBody LoginData loginData) throws Exception {
    	CreateLoginDataOutput createLoginDataOutput = new CreateLoginDataOutput();
    	LoginData data = letriveLoginData.getLoginData(loginData.getUsername(), loginData.getPassword());
    	if (data !=null && (data.getUsername().equalsIgnoreCase("user1") ||
    						data.getUsername().equalsIgnoreCase("user2"))) {
    		createLoginDataOutput.setReturnMessage("verified user "+data.getUsername()+" Successful!!");
    		createLoginDataOutput.setUsername(data.getUsername());
    	}
    	else
    	{
    		createLoginDataOutput.setReturnMessage("Failed");
    	}
    	
    	return createLoginDataOutput;
    }

}
