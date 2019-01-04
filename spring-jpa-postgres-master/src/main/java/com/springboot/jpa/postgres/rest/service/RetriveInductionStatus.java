package com.springboot.jpa.postgres.rest.service;

import java.util.List;

import com.springboot.jpa.postgres.rest.model.InductionStatus;

public interface RetriveInductionStatus {
	public List<InductionStatus> getInductionStatus(String userid);
}