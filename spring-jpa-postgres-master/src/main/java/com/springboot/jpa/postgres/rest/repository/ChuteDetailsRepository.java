package com.springboot.jpa.postgres.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.ChuteDetails;

@Repository
public interface ChuteDetailsRepository extends JpaRepository<ChuteDetails, Long> {
	
	List<ChuteDetails> findByUserid(String userid);
}
