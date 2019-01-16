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
@Table(name = "chute_details")
public class ChuteDetails{
	@Id
    @GeneratedValue(generator = "SampleData_generator")
    @SequenceGenerator(
            name = "SampleData_generator",
            sequenceName = "SampleData_sequence",
            initialValue = 100
    )
    private Long id;
	
	@Column(columnDefinition = "chute_nbr")
	private Integer chute_nbr;

	@Column(columnDefinition = "product_full")
	private String product_full;
	
	@Column(columnDefinition = "product_disabled")
	private String product_disabled;
	
	@Column(columnDefinition = "duration")
	private String duration;
	
	@Column(columnDefinition = "created_ts")
	private String created_ts;
	
	@Column(columnDefinition = "userid")
	private String userid;
}