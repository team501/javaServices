package com.springboot.jpa.postgres.rest.service;

import java.util.Optional;

import com.springboot.jpa.postgres.rest.model.InductsForLastHourOutput;

public interface RetriveInductsForLastHour {
	public InductsForLastHourOutput getInductsForLastHour(String userId, Optional<String> sorterId) throws Exception;
}