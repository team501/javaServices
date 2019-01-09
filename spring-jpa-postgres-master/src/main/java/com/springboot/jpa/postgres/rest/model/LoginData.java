package com.springboot.jpa.postgres.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "login_data")
public class LoginData{
	@Id
	@Column(columnDefinition = "username")
    private String username;
	
	@Column(columnDefinition = "password")
	private String password;
}