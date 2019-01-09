package com.springboot.jpa.postgres.rest.service;

import java.util.Optional;

import com.springboot.jpa.postgres.rest.model.InductsForTheDayOutput;

public interface RetriveInductsForTheDay {
	InductsForTheDayOutput getInductsForTheDay(String userId, Optional<String> sorterid) throws Exception;
}