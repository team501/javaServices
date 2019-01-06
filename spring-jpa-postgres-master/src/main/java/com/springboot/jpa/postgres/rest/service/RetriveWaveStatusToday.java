package com.springboot.jpa.postgres.rest.service;


import com.springboot.jpa.postgres.rest.model.WaveStatusToday;

public interface RetriveWaveStatusToday {
	public WaveStatusToday getWaveStatusToday(String userid) throws Exception;;
}