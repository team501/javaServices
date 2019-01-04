package com.springboot.jpa.postgres.rest.model;

import java.util.List;

//@Data
public class InductsForLastHourOutput{
	private List<InductsForLastHour> inductsForTheDayList;
	
	public List<InductsForLastHour> getInductsForTheDayList() {
		return inductsForTheDayList;
	}

	public void setInductsForTheDayList(List<InductsForLastHour> inductsForTheDayList) {
		this.inductsForTheDayList = inductsForTheDayList;
	}

	public double getPercentValue() {
		return percentValue;
	}

	public void setPercentValue(double percentValue) {
		this.percentValue = percentValue;
	}

	public Integer getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Integer currentValue) {
		this.currentValue = currentValue;
	}

	public Integer getGoalValue() {
		return goalValue;
	}

	public void setGoalValue(Integer goalValue) {
		this.goalValue = goalValue;
	}

	private double percentValue;
	
	private Integer currentValue;
	
	private Integer goalValue;
	
	
}