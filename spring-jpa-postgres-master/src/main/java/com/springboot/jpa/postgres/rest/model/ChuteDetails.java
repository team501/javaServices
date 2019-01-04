package com.springboot.jpa.postgres.rest.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "chute_details")
public class ChuteDetails{
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getChute_nbr() {
		return chute_nbr;
	}

	public void setChute_nbr(Integer chute_nbr) {
		this.chute_nbr = chute_nbr;
	}

	public String getProduct_full() {
		return product_full;
	}

	public void setProduct_full(String product_full) {
		this.product_full = product_full;
	}

	public String getProduct_disabled() {
		return product_disabled;
	}

	public void setProduct_disabled(String product_disabled) {
		this.product_disabled = product_disabled;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Timestamp getCreated_ts() {
		return created_ts;
	}

	public void setCreated_ts(Timestamp created_ts) {
		this.created_ts = created_ts;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

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
	private Timestamp created_ts;
	
	@Column(columnDefinition = "userid")
	private String userid;
}