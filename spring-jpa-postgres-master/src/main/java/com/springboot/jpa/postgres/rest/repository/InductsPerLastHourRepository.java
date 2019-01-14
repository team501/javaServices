package com.springboot.jpa.postgres.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.InductsForLastHour;

@Repository
public interface InductsPerLastHourRepository extends JpaRepository<InductsForLastHour, Long> {
	
	List<InductsForLastHour> findFirst5ByUseridOrderByCurrentHourDesc(String userid);
	
	List<InductsForLastHour> findFirst5ByUseridAndSorteridOrderByCurrentHourDesc(String userid,String sorterid);
	
	@Query("Select i from InductsForLastHour i where userid=:userid and currentHour = (select max(currentHour) from InductsForLastHour i1 where i1.userid=:userid)")
	List<InductsForLastHour> findByUseridOrderByCurrentHourDesc(@Param("userid") String userid);
	
	List<InductsForLastHour> findFirst1ByUseridAndSorteridOrderByCurrentHourDesc(String userid,String sorterid);
}
