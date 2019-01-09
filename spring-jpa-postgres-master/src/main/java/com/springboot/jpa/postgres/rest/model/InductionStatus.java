package com.springboot.jpa.postgres.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Induction_status")
public class InductionStatus{
	@Id
    @GeneratedValue(generator = "SampleData_generator")
    @SequenceGenerator(
            name = "SampleData_generator",
            sequenceName = "SampleData_sequence",
            initialValue = 100
    )
    private Integer id;
	
	@Column(columnDefinition = "runtime")
	private String runtime;

	@Column(columnDefinition = "total_inducts")
	private Integer total_inducts;
	
	@Column(columnDefinition = "inducts_per_hour")
	private Integer inducts_per_hour;
	
	@Column(columnDefinition = "utilization")
	private Integer utilization;
	
	@Column(columnDefinition = "peak_rate")
	private Integer peak_rate;
	
	@Column(columnDefinition = "avg_rate")
	private Integer avg_rate;
	
	@Column(columnDefinition = "min_rate")
	private Integer min_rate;
	
	@Column(columnDefinition = "current_usr")
	private String current_usr;
	
	@Column(columnDefinition = "last_scan")
	private String last_scan;
	
	@Column(columnDefinition = "userid")
	private String userid;
}