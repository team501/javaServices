package com.springboot.jpa.postgres.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.InductsForLastHour;

@Repository
public interface InductsPerLastHourRepository extends JpaRepository<InductsForLastHour, Long> {
	
	List<InductsForLastHour> findFirst5ByOrderByCurrentHourDesc();
	
	List<InductsForLastHour> findFirst5BySorteridOrderByCurrentHourDesc(String sorterid);
	
	@Query("Select i from InductsForLastHour i where currentHour = (select max(currentHour) from InductsForLastHour)")
	List<InductsForLastHour> findByUseridOrderByCurrentHourDesc();
	
	List<InductsForLastHour> findFirst1BySorteridOrderByCurrentHourDesc(String sorterid);
}
