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
	
	@Column(columnDefinition = "sorterid")
	private String sorterid;
}