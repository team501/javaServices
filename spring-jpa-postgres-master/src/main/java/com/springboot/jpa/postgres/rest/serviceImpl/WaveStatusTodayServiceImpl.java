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
		WaveStatusToday  waveStatusToday= waveStatusTodayRepository.findByUserid(userid);
		
		Integer units = waveStatusToday.getAllocated()+waveStatusToday.getRemaining()+waveStatusToday.getSorted();
		waveStatusToday.setUnits(units);
		waveStatusToday.setAllocatedPercentage((waveStatusToday.getAllocated()*100)/units);
		waveStatusToday.setSortedPercentage((waveStatusToday.getSorted()*100)/units);
		waveStatusToday.setRemainingPercentage((waveStatusToday.getRemaining()*100)/units);
		return waveStatusToday;
	}
}