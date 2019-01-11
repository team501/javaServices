package com.springboot.jpa.postgres.rest.serviceImpl;

import java.util.List;
import java.util.Optional;

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
	public InductsForLastHourOutput getInductsForLastHour(String userId, Optional<String> sorterId) throws Exception {
		List<InductsForLastHour> list;
		if(sorterId.isPresent()) {
			list = inductsPerLastHourRepository.findFirst5ByUseridAndSorterid(userId,sorterId.get());
		}else {
			list = inductsPerLastHourRepository.findFirst5ByUserid(userId);
		}
		InductsForLastHourOutput inductsForlastHour = new InductsForLastHourOutput();
		if(!list.isEmpty()) {
			int goalSumVal= list.stream().mapToInt(obj->obj.getGoal()).sum();
			
			int currVal= list.stream().mapToInt(obj->obj.getCurrValue()).sum();
			
			double percentValue = ((currVal/(double)goalSumVal)*100);
			
			inductsForlastHour.setInductsForLastHour(list);
			inductsForlastHour.setCurrentValue(currVal);
			inductsForlastHour.setGoalValue(goalSumVal);
			inductsForlastHour.setPercentValue(percentValue);
		}
		return inductsForlastHour;
	}
}