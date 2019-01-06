package com.springboot.jpa.postgres.rest.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.InductionStatusPerHour;
import com.springboot.jpa.postgres.rest.repository.InductionStatusPerHourRepository;
import com.springboot.jpa.postgres.rest.service.RetriveInductionStatusPerHour;

@Service
public class RetriveInductionStatusPerHourServiceImpl implements RetriveInductionStatusPerHour{
	
	@Autowired
    private InductionStatusPerHourRepository inductsPerLastHourRepository;

	@Override
	public InductionStatusPerHour getInductionStatusPerHour(String userid) throws Exception {
		return inductsPerLastHourRepository.findByUserid(userid);
	}
}