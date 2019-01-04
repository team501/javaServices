package com.springboot.jpa.postgres.rest.service;

import com.springboot.jpa.postgres.rest.model.InductsForTheDayOutput;

public interface RetriveInductsForTheDay {
	public InductsForTheDayOutput getInductsForTheDay(String userId) throws Exception;
}