package com.springboot.jpa.postgres.rest.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Inducts_for_the_day")
public class InductsForTheDay{
	@Id
    @GeneratedValue(generator = "SampleData_generator")
    @SequenceGenerator(
            name = "SampleData_generator",
            sequenceName = "SampleData_sequence",
            initialValue = 100
    )
    private Long id;
	
	@Column(columnDefinition = "current_dt")
	private Date currentDt;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCurrentDt() {
		return currentDt;
	}

	public void setCurrentDt(Date currentDt) {
		this.currentDt = currentDt;
	}

	public Integer getCurr_value() {
		return curr_value;
	}

	public void setCurr_value(Integer curr_value) {
		this.curr_value = curr_value;
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
	private Integer curr_value;
	
	@Column(columnDefinition = "goal")
	private Integer goal;
	
//	private Integer[] values;
	@Column(columnDefinition = "userid")
	private String userid;
}