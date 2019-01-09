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
	
	private Integer allocatedPercentage;
	
	private Integer sortedPercentage;
	
	private Integer remainingPercentage;
}