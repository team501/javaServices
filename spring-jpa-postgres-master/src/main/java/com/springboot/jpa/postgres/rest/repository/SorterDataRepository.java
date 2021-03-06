package com.springboot.jpa.postgres.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.SorterData;

@Repository
public interface SorterDataRepository extends JpaRepository<SorterData, Long> {
	
	List<SorterData> findAllByOrderBySorterId();
	
	List<SorterData> findBySorterIdOrderBySorterId(String sorterId);
}
