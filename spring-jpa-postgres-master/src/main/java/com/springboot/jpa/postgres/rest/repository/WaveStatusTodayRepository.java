package com.springboot.jpa.postgres.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.WaveStatusToday;

@Repository
public interface WaveStatusTodayRepository extends JpaRepository<WaveStatusToday, Long> {
	
	WaveStatusToday findFirstBy();
}
