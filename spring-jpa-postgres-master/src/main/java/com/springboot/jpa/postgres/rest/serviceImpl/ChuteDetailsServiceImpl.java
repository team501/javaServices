package com.springboot.jpa.postgres.rest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.ChuteDetails;
import com.springboot.jpa.postgres.rest.repository.ChuteDetailsRepository;
import com.springboot.jpa.postgres.rest.service.RetriveChuteDetails;

@Service
public class ChuteDetailsServiceImpl implements RetriveChuteDetails{
	
	@Autowired
    private ChuteDetailsRepository chuteDetailsRepository;

	@Override
	public List<ChuteDetails> getChuteDetails(String userId) throws Exception {
		return chuteDetailsRepository.findByUserid(userId);
	}
}