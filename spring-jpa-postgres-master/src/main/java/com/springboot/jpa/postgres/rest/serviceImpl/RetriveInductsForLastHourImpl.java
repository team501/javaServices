package com.springboot.jpa.postgres.rest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.InductsForLastHour;
import com.springboot.jpa.postgres.rest.model.InductsForLastHourOutput;
import com.springboot.jpa.postgres.rest.repository.InductsPerLastHourRepository;
import com.springboot.jpa.postgres.rest.service.RetriveInductsForLastHour;

@Service
public class RetriveInductsForLastHourImpl implements RetriveInductsForLastHour{
	
	@Autowired
    private InductsPerLastHourRepository inductsPerLastHourRepository;

	@Override
	public InductsForLastHourOutput getInductsForLastHour(String userId) throws Exception {
		List<InductsForLastHour> list = inductsPerLastHourRepository.findByUserid(userId);
		InductsForLastHourOutput inductsForTheDayOutput = new InductsForLastHourOutput();
		
		Integer currentValue = list.get(0).getCurrValue();
		
		Integer goalValue = list.get(0).getGoal();
		
		double percentValue = ((currentValue/(double)goalValue)*100);
		
		inductsForTheDayOutput.setInductsForTheDayList(list);
		inductsForTheDayOutput.setCurrentValue(currentValue);
		inductsForTheDayOutput.setGoalValue(goalValue);
		inductsForTheDayOutput.setPercentValue(percentValue);
		return inductsForTheDayOutput;
	}
}