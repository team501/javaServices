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
		List<InductsForLastHour> inductsForLastHourList;
		if(sorterId.isPresent()) {
			inductsForLastHourList = inductsPerLastHourRepository.findFirst1ByUseridAndSorteridOrderByCurrentHourDesc(userId, sorterId.get());
			list = inductsPerLastHourRepository.findFirst5ByUseridAndSorteridOrderByCurrentHourDesc(userId,sorterId.get());
		}else {
			inductsForLastHourList = inductsPerLastHourRepository.findByUseridOrderByCurrentHourDesc(userId);
			list = inductsPerLastHourRepository.findFirst5ByUseridOrderByCurrentHourDesc(userId);
		}
		InductsForLastHourOutput inductsForlastHour = new InductsForLastHourOutput();
		if(!list.isEmpty()) {
			int goalSumVal= inductsForLastHourList.stream().mapToInt(obj->obj.getGoal()).sum();
			
			int currVal= inductsForLastHourList.stream().mapToInt(obj->obj.getCurrValue()).sum();
			
			Integer percentValue = (int) Math.round( ((currVal/(double)goalSumVal)*100));
			
			inductsForlastHour.setInductsForLastHour(list);
			inductsForlastHour.setCurrentValue(currVal);
			inductsForlastHour.setGoalValue(goalSumVal);
			inductsForlastHour.setPercentValue(percentValue);
		}
		return inductsForlastHour;
	}
}