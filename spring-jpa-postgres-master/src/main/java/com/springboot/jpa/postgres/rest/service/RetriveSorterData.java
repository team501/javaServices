package com.springboot.jpa.postgres.rest.service;

import com.springboot.jpa.postgres.rest.model.SorterData;

public interface RetriveSorterData {
	public SorterData getSorterData(String userId) throws Exception;
}