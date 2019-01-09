package com.springboot.jpa.postgres.rest.serviceImpl;

import java.util.List;
import java.util.Optional;

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
			list = inductsPerDayRepository.findByUseridAndSorterid(userId,sorterid.get());
		}else {
			list = inductsPerDayRepository.findByUserid(userId);
		}
		
		InductsForTheDayOutput inductsForTheDayOutput = new InductsForTheDayOutput();
		if(!list.isEmpty()) {
			Integer currentValue = list.get(0).getCurr_value();
			
			Integer goalValue = list.get(0).getGoal();
			
			double percentValue = ((currentValue/(double)goalValue)*100);
			
			inductsForTheDayOutput.setInductsForTheDayList(list);
			inductsForTheDayOutput.setCurrentValue(currentValue);
			inductsForTheDayOutput.setGoalValue(goalValue);
			inductsForTheDayOutput.setPercentValue(percentValue);
		}
		return inductsForTheDayOutput;
	}
}