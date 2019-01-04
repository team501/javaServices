package com.springboot.jpa.postgres.rest.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.ChuteSummary;
import com.springboot.jpa.postgres.rest.repository.ChuteSummaryRepository;
import com.springboot.jpa.postgres.rest.service.RetriveChuteSummary;

@Service
public class ChuteSummaryServiceImpl implements RetriveChuteSummary{
	
	@Autowired
    private ChuteSummaryRepository chuteSummaryRepository;

	@Override
	public ChuteSummary getChuteSummary(String userId) throws Exception {
		return chuteSummaryRepository.findByUserid(userId);
	}
}