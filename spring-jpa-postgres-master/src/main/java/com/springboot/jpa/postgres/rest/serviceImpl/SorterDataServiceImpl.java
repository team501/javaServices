package com.springboot.jpa.postgres.rest.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.SorterData;
import com.springboot.jpa.postgres.rest.repository.SorterDataRepository;
import com.springboot.jpa.postgres.rest.service.RetriveSorterData;

@Service
public class SorterDataServiceImpl implements RetriveSorterData{
	
	@Autowired
    private SorterDataRepository sorterDataRepository;

	@Override
	public SorterData getSorterData(String userId) throws Exception {
		return sorterDataRepository.findByUserid(userId);
	}
}