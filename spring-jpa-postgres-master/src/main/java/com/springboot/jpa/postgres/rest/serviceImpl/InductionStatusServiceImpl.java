package com.springboot.jpa.postgres.rest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.InductionStatus;
import com.springboot.jpa.postgres.rest.repository.InductionStatusRepository;
import com.springboot.jpa.postgres.rest.service.RetriveInductionStatus;

@Service
public class InductionStatusServiceImpl implements RetriveInductionStatus{
	
	@Autowired
    private InductionStatusRepository inductionStatusRepository;

	@Override
	public List<InductionStatus> getInductionStatus(String userid) {
		return inductionStatusRepository.findAll();
	}
}