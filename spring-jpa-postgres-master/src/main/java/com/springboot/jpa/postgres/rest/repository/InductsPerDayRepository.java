package com.springboot.jpa.postgres.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.InductsForTheDay;

import java.util.List;

@Repository
public interface InductsPerDayRepository extends JpaRepository<InductsForTheDay, Long> {
	
	List<InductsForTheDay> findByUserid(String userid);
	
	List<InductsForTheDay> findByUseridAndSorterid(String userid,String sortrid);
}
