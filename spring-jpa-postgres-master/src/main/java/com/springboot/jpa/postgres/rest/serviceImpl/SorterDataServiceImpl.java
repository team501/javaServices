package com.springboot.jpa.postgres.rest.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

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
	public List<SorterData> getSorterData(String userId) throws Exception {
		List<SorterData> sorterData= sorterDataRepository.findAllByOrderBySorterId();
				
		return sorterData.stream().map(mapper -> {
			mapper.setAssignedPercentage(80);
			mapper.setInductsLastHourPercentage(4000*100/5000);
			mapper.setSortsPercentage(40);
			mapper.setSorterFullPercentage(50);
			return mapper;
		}).collect(Collectors.toList());
	}
	
	@Override
	public  List<SorterData> getSorterDataByUserIdAndSorterId(String userId, String sorterId) throws Exception {
		List<SorterData> sorterData= sorterDataRepository.findBySorterIdOrderBySorterId(sorterId);
		
		return sorterData.stream().map(mapper -> {
			mapper.setAssignedPercentage(80);
			mapper.setInductsLastHourPercentage(4000*100/5000);
			mapper.setSortsPercentage(40);
			mapper.setSorterFullPercentage(50);
			return mapper;
		}).collect(Collectors.toList());
	}
}