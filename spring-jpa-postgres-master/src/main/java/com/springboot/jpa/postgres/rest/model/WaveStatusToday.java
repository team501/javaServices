package com.springboot.jpa.postgres.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "wave_status_today")
public class WaveStatusToday{
	
	@Id
    @GeneratedValue(generator = "SampleData_generator")
    @SequenceGenerator(
            name = "SampleData_generator",
            sequenceName = "SampleData_sequence",
            initialValue = 100
    )
    private Long id;
	
	@Column(columnDefinition = "allocated")
	private Integer allocated;

	@Column(columnDefinition = "sorted")
	private Integer sorted;
	
	@Column(columnDefinition = "remaining")
	private Integer remaining;
	
	@Column(columnDefinition = "wave")
	private Integer wave;
	
	@Column(columnDefinition = "userid")
	private String userid;
	
	private Integer units;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAllocated() {
		return allocated;
	}

	public void setAllocated(Integer allocated) {
		this.allocated = allocated;
	}

	public Integer getSorted() {
		return sorted;
	}

	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}

	public Integer getRemaining() {
		return remaining;
	}

	public void setRemaining(Integer remaining) {
		this.remaining = remaining;
	}

	public Integer getWave() {
		return wave;
	}

	public void setWave(Integer wave) {
		this.wave = wave;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}
	
}