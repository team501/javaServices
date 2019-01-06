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
		waveStatusToday.setUnits(waveStatusToday.getAllocated()+waveStatusToday.getRemaining()+waveStatusToday.getSorted());
		return waveStatusToday;
	}
}