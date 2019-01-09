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
		SorterData sorterData= sorterDataRepository.findByUserid(userId);
		
		sorterData.setAssignedPercentage(80);
		sorterData.setInductsLastHourPercentage(4000*100/5000);
		sorterData.setSortsPercentage(40);
		sorterData.setSorterFullPercentage(50);
		return sorterData;
	}
	
	@Override
	public SorterData getSorterDataByUserIdAndSorterId(String userId, String sorterId) throws Exception {
		SorterData sorterData= sorterDataRepository.findByUseridAndSorterId(userId,sorterId);
		
		sorterData.setAssignedPercentage(80);
		sorterData.setInductsLastHourPercentage(4000*100/5000);
		sorterData.setSortsPercentage(40);
		sorterData.setSorterFullPercentage(50);
		return sorterData;
	}
}