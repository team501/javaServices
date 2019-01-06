package com.springboot.jpa.postgres.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.InductionStatusPerHour;

@Repository
public interface InductionStatusPerHourRepository extends JpaRepository<InductionStatusPerHour, Long> {
	
	InductionStatusPerHour findByUserid(String userid);
}
