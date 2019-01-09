package com.springboot.jpa.postgres.rest.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
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
	
	@Column(columnDefinition = "curr_value")
	private Integer curr_value;
	
	@Column(columnDefinition = "goal")
	private Integer goal;
	
	@Column(columnDefinition = "userid")
	private String userid;
	
	@Column(columnDefinition = "sorterid")
	private String sorterid;
}