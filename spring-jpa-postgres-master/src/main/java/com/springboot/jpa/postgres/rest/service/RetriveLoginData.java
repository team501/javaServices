package com.springboot.jpa.postgres.rest.service;


import com.springboot.jpa.postgres.rest.model.LoginData;

public interface RetriveLoginData {
	public LoginData getLoginData(String userid) throws Exception;
	
	public LoginData createLoginData(LoginData loginData) throws Exception;
}