package com.springboot.jpa.postgres.rest.model;

import java.util.List;
import lombok.Data;

@Data
public class InductsForTheDayOutput{
	private List<InductsForTheDay> inductsForTheDayList;
	
	private Integer percentValue;
	
	private Integer currentValue;
	
	private Integer goalValue;
		
}