package com.springboot.jpa.postgres.rest.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.postgres.rest.model.WaveStatusToday;
import com.springboot.jpa.postgres.rest.repository.WaveStatusTodayRepository;
import com.springboot.jpa.postgres.rest.service.RetriveWaveStatusToday;

@Service
public class WaveStatusTodayServiceImpl implements RetriveWaveStatusToday{
	
	@Autowired
    private WaveStatusTodayRepository waveStatusTodayRepository;

	@Override
	public WaveStatusToday getWaveStatusToday(String userid) throws Exception {
		WaveStatusToday  waveStatusToday= waveStatusTodayRepository.findFirstBy();
		
		Integer remaining = waveStatusToday.getUnits() - waveStatusToday.getSorted();
		Integer sorted = waveStatusToday.getSorted();
		Integer allocated = waveStatusToday.getAllocated();
		Integer units = remaining+sorted+allocated;
		waveStatusToday.setAllocatedPercentage((allocated * 100)/units);
		waveStatusToday.setSortedPercentage(( sorted * 100)/units);
		waveStatusToday.setRemainingPercentage((remaining * 100)/units);
		waveStatusToday.setRemaining(remaining);
		return waveStatusToday;
	}
}