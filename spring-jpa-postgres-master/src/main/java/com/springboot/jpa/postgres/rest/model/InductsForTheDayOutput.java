package com.springboot.jpa.postgres.rest.model;

import java.util.List;

//@Data
public class InductsForTheDayOutput{
	private List<InductsForTheDay> inductsForTheDayList;
	
	public List<InductsForTheDay> getInductsForTheDayList() {
		return inductsForTheDayList;
	}

	public void setInductsForTheDayList(List<InductsForTheDay> inductsForTheDayList) {
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