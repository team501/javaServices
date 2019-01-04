package com.springboot.jpa.postgres.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public Integer getTotal_inducts() {
		return total_inducts;
	}

	public void setTotal_inducts(Integer total_inducts) {
		this.total_inducts = total_inducts;
	}

	public Integer getInducts_per_hour() {
		return inducts_per_hour;
	}

	public void setInducts_per_hour(Integer inducts_per_hour) {
		this.inducts_per_hour = inducts_per_hour;
	}

	public Integer getAvg_rate() {
		return avg_rate;
	}

	public void setAvg_rate(Integer avg_rate) {
		this.avg_rate = avg_rate;
	}

	public Integer getMin_rate() {
		return min_rate;
	}

	public void setMin_rate(Integer min_rate) {
		this.min_rate = min_rate;
	}

	public String getCurrent_usr() {
		return current_usr;
	}

	public void setCurrent_usr(String current_usr) {
		this.current_usr = current_usr;
	}

	public String getLast_scan() {
		return last_scan;
	}

	public void setLast_scan(String last_scan) {
		this.last_scan = last_scan;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

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
	
	public Integer getUtilization() {
		return utilization;
	}

	public void setUtilization(Integer utilization) {
		this.utilization = utilization;
	}

	public Integer getPeak_rate() {
		return peak_rate;
	}

	public void setPeak_rate(Integer peak_rate) {
		this.peak_rate = peak_rate;
	}

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