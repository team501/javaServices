package com.springboot.jpa.postgres.rest.service;


import com.springboot.jpa.postgres.rest.model.InductionStatusPerHour;

public interface RetriveInductionStatusPerHour {
	public InductionStatusPerHour getInductionStatusPerHour(String userid, String sorterid) throws Exception;
}