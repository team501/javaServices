package com.springboot.jpa.postgres.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.postgres.rest.model.InductsForTheDay;

import java.util.List;

@Repository
public interface InductsPerDayRepository extends JpaRepository<InductsForTheDay, Long> {
	
	List<InductsForTheDay> findFirst5ByUseridOrderByCurrentDtDesc(String userid);
	
	List<InductsForTheDay> findFirst5ByUseridAndSorteridOrderByCurrentDtDesc(String userid,String sortrid);
	
	@Query("Select i from InductsForTheDay i where userid=:userid and currentDt = (select max(currentDt) from InductsForTheDay i1 where i1.userid=:userid)")
	List<InductsForTheDay> findByUseridOrderByCurrentDtDesc(@Param("userid") String userid);
	
	//@Query("Select * from Inducts_for_the_day where userid=:userid and sorterid=:sorterid and current_dt = (select max(current_dt) from Inducts_for_the_day")
	List<InductsForTheDay> findFirst1ByUseridAndSorteridOrderByCurrentDtDesc(@Param("userid")String userid,@Param("sorterid") String sortrid);
}
