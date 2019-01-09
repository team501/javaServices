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
		ChuteSummary chuteSummary = chuteSummaryRepository.findByUserid(userId);
		Integer chuteUtilization = chuteSummary.getDisabled()+chuteSummary.getChuteFull()+chuteSummary.getEmpty()+chuteSummary.getError();
		chuteSummary.setFullPercentage(chuteSummary.getChuteFull()*100/chuteUtilization);
		chuteSummary.setEmptyPercentage(chuteSummary.getEmpty()*100/chuteUtilization);
		chuteSummary.setErrorPercentage(chuteSummary.getError()*100/chuteUtilization);
		chuteSummary.setDisabledPercentage(chuteSummary.getDisabled()*100/chuteUtilization);
		chuteSummary.setAssignedPercentage(chuteSummary.getAssigned()*100/chuteUtilization);
		chuteSummary.setUtilization(chuteUtilization);
		return chuteSummary;
	}
}