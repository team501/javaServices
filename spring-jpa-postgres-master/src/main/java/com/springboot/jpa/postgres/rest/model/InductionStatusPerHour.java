package com.springboot.jpa.postgres.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "induction_status_per_hour")
public class InductionStatusPerHour{
	
	@Id
    @GeneratedValue(generator = "SampleData_generator")
    @SequenceGenerator(
            name = "SampleData_generator",
            sequenceName = "SampleData_sequence",
            initialValue = 100
    )
    private Long id;
	
	@Column(columnDefinition = "peak")
	private Integer peak;

	@Column(columnDefinition = "average")
	private Integer average;
	
	@Column(columnDefinition = "recric")
	private Integer recric;
	
	@Column(columnDefinition = "minimum")
	private Integer minimum;
	
	@Column(columnDefinition = "userid")
	private String userid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPeak() {
		return peak;
	}

	public void setPeak(Integer peak) {
		this.peak = peak;
	}

	public Integer getSorted() {
		return average;
	}

	public void setSorted(Integer average) {
		this.average = average;
	}

	public Integer getRecric() {
		return recric;
	}

	public void setRecric(Integer recric) {
		this.recric = recric;
	}

	public Integer getMinimum() {
		return minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
}