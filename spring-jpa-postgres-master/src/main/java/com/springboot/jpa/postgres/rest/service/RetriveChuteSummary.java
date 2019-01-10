package com.springboot.jpa.postgres.rest.service;

import com.springboot.jpa.postgres.rest.model.ChuteSummary;

public interface RetriveChuteSummary {
	public ChuteSummary getChuteSummary(String userId, String sorterid) throws Exception;
}