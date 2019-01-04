package com.springboot.jpa.postgres.rest.service;


import java.util.List;

import com.springboot.jpa.postgres.rest.model.ChuteDetails;

public interface RetriveChuteDetails {
	public List<ChuteDetails> getChuteDetails(String userid) throws Exception;;
}