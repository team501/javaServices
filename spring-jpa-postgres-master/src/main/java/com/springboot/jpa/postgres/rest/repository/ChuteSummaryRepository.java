package com.springboot.jpa.postgres.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.ChuteSummary;

@Repository
public interface ChuteSummaryRepository extends JpaRepository<ChuteSummary, Long> {
	
	ChuteSummary findBySorterid(String sortid);
}
