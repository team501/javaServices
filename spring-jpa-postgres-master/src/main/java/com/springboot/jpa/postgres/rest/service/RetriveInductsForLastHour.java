package com.springboot.jpa.postgres.rest.service;

import com.springboot.jpa.postgres.rest.model.InductsForLastHourOutput;

public interface RetriveInductsForLastHour {
	public InductsForLastHourOutput getInductsForLastHour(String userId) throws Exception;
}