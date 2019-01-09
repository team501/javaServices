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
@Table(name = "sorter_data")
public class SorterData{
	@Id
    @GeneratedValue(generator = "SampleData_generator")
    @SequenceGenerator(
            name = "SampleData_generator",
            sequenceName = "SampleData_sequence",
            initialValue = 100
    )
    private String sorterId;
	
	@Column(columnDefinition = "Inducts_last_hour")
	private Integer inducts_last_hour;

	@Column(columnDefinition = "sorts_last_hour")
	private Integer sorts_last_hour;
	
	@Column(columnDefinition = "assigned")
	private Integer assigned;
	
	@Column(columnDefinition = "sorter_full")
	private String sorter_full;
	
	@Column(columnDefinition = "userid")
	private String userid;
	
	private Integer assignedPercentage;
	
	private Integer inductsLastHourPercentage;
	
	private Integer sortsPercentage;
	
	private Integer sorterFullPercentage;
}