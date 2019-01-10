package com.springboot.jpa.postgres.rest.service;

import java.util.List;

import com.springboot.jpa.postgres.rest.model.SorterData;

public interface RetriveSorterData {
	public List<SorterData> getSorterData(String userId) throws Exception;

	public List<SorterData> getSorterDataByUserIdAndSorterId(String userId, String sorterId) throws Exception;
}