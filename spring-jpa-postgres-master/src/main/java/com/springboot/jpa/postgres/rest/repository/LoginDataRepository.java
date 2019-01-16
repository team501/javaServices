package com.springboot.jpa.postgres.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.LoginData;

@Repository
public interface LoginDataRepository extends JpaRepository<LoginData, Long> {
	
	LoginData findByUsernameAndPassword(String username, String password);
	
	LoginData saveLoginInfo(LoginData loginData);
}
