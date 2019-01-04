package com.springboot.jpa.postgres.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Inducts_for_lst_hour")
public class InductsForLastHour{
	@Id
    @GeneratedValue(generator = "SampleData_generator")
    @SequenceGenerator(
            name = "SampleData_generator",
            sequenceName = "SampleData_sequence",
            initialValue = 100
    )
    private Long id;
	
	@Column(columnDefinition = "current_hour")
	private String currentHour;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurrentHour() {
		return currentHour;
	}

	public void setCurrentHour(String currentHour) {
		this.currentHour = currentHour;
	}

	public Integer getCurrValue() {
		return currValue;
	}

	public void setCurrValue(Integer currValue) {
		this.currValue = currValue;
	}

	public Integer getGoal() {
		return goal;
	}

	public void setGoal(Integer goal) {
		this.goal = goal;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserId(String userId) {
		this.userid = userId;
	}

	@Column(columnDefinition = "curr_value")
	private Integer currValue;
	
	@Column(columnDefinition = "goal")
	private Integer goal;
	
	@Column(columnDefinition = "userid")
	private String userid;
}