package com.springboot.jpa.postgres.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.InductsForLastHour;

@Repository
public interface InductsPerHourRepository extends JpaRepository<InductsForLastHour, Long> {
	
	List<InductsForLastHour> findAll();
} 
