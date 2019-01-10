package com.springboot.jpa.postgres.rest.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "chute_summary")
public class ChuteSummary{
	@Id
    @GeneratedValue(generator = "SampleData_generator")
    @SequenceGenerator(
            name = "SampleData_generator",
            sequenceName = "SampleData_sequence",
            initialValue = 100
    )
    private Long id;
	
	@Column(columnDefinition = "created_ts")
	private Timestamp createdTs;

	@Column(columnDefinition = "chute_full")
	private Integer chuteFull;
	
	@Column(columnDefinition = "empty")
	private Integer empty;
	
	@Column(columnDefinition = "error")
	private Integer error;
	
	@Column(columnDefinition = "disabled")
	private Integer disabled;
	
	@Column(columnDefinition = "assigned")
	private Integer assigned;
	
	@Column(columnDefinition = "notassigned")
	private Integer notassigned;
	
	@Column(columnDefinition = "userid")
	private String userid;
	
	@Column(columnDefinition = "sorterid")
	private String sorterid;
	
	private Integer fullPercentage;
	
	private Integer emptyPercentage;
	
	private Integer errorPercentage;
	
	private Integer disabledPercentage;
	
	private Integer assignedPercentage;
	
	private Integer utilization;
}