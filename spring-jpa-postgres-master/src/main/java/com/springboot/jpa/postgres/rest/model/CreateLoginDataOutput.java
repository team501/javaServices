package com.springboot.jpa.postgres.rest.model;

import lombok.Data;

@Data
public class CreateLoginDataOutput {

	private String returnMessage;
	private String username;
}
