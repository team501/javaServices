package com.springboot.jpa.postgres.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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

	public String getSorterId() {
		return sorterId;
	}

	public void setSorterId(String sorterId) {
		this.sorterId = sorterId;
	}

	public Integer getInducts_last_hour() {
		return inducts_last_hour;
	}

	public void setInducts_last_hour(Integer inducts_last_hour) {
		this.inducts_last_hour = inducts_last_hour;
	}

	public Integer getSorts_last_hour() {
		return sorts_last_hour;
	}

	public void setSorts_last_hour(Integer sorts_last_hour) {
		this.sorts_last_hour = sorts_last_hour;
	}

	public Integer getAssigned() {
		return assigned;
	}

	public void setAssigned(Integer assigned) {
		this.assigned = assigned;
	}

	public String getSorter_full() {
		return sorter_full;
	}

	public void setSorter_full(String sorter_full) {
		this.sorter_full = sorter_full;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(columnDefinition = "assigned")
	private Integer sorts_last_hour;
	
	@Column(columnDefinition = "assigned")
	private Integer assigned;
	
	@Column(columnDefinition = "sorter_full")
	private String sorter_full;
	
	@Column(columnDefinition = "userid")
	private String userid;
}