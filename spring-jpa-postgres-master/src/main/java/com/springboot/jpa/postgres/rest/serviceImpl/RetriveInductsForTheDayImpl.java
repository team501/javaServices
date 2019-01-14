package com.springboot.jpa.postgres.rest.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.InductsForTheDay;
import com.springboot.jpa.postgres.rest.model.InductsForTheDayOutput;
import com.springboot.jpa.postgres.rest.repository.InductsPerDayRepository;
import com.springboot.jpa.postgres.rest.service.RetriveInductsForTheDay;

@Service
public class RetriveInductsForTheDayImpl implements RetriveInductsForTheDay{
	
	@Autowired
    private InductsPerDayRepository inductsPerDayRepository;

	@Override
	public InductsForTheDayOutput getInductsForTheDay(String userId, Optional<String> sorterid) throws Exception {
		List<InductsForTheDay> list;
		if(sorterid.isPresent()) {
			list = inductsPerDayRepository.findFirst5ByUseridAndSorterid(userId,sorterid.get());
		}else {
			list = inductsPerDayRepository.findFirst5ByUserid(userId);
		}
		
		InductsForTheDayOutput inductsForTheDayOutput = new InductsForTheDayOutput();
		if(!list.isEmpty()) {
			int goalSumVal= list.stream().mapToInt(obj->obj.getGoal()).sum();
			
			int currVal= list.stream().mapToInt(obj->obj.getCurr_value()).sum();
			
			Integer percentValue = (int) Math.round(((currVal/(double)goalSumVal)*100));
			
			inductsForTheDayOutput.setInductsForTheDayList(list);
			inductsForTheDayOutput.setCurrentValue(currVal);
			inductsForTheDayOutput.setGoalValue(goalSumVal);
			inductsForTheDayOutput.setPercentValue(percentValue);
		}
		return inductsForTheDayOutput;
	}
}