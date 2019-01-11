package com.springboot.jpa.postgres.rest.model;

import java.util.List;

import lombok.Data;

@Data
public class InductsForLastHourOutput{
	private List<InductsForLastHour> inductsForLastHour;

	private double percentValue;
	
	private Integer currentValue;
	
	private Integer goalValue;
	
	
}