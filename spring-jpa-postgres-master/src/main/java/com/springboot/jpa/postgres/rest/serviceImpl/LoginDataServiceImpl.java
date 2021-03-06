package com.springboot.jpa.postgres.rest.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.LoginData;
import com.springboot.jpa.postgres.rest.repository.LoginDataRepository;
import com.springboot.jpa.postgres.rest.service.RetriveLoginData;

@Service
public class LoginDataServiceImpl implements RetriveLoginData{
	
	@Autowired
    private LoginDataRepository loginDataRepository;

	@Override
	public LoginData getLoginData(String userid, String password) throws Exception {
		return loginDataRepository.findByUsernameAndPassword(userid, password);
	}

	@Override
	public LoginData createLoginData(LoginData loginData) throws Exception {
		return loginDataRepository.save(loginData);
	}
}