package com.cltech.model;


import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "experience")
public class ExeperienceModel {

	@Id
	/* @GeneratedValue(strategy = GenerationType.AUTO) */
	private Long id;

	@Column
	private String jobTitle;

	@Column
	private String organizationName;

	@Column
	private String jobDescription;

	@Column
	private String startDate;

	@Column
	private String endDate;

	@Column
	private boolean currentlyWorking;

	@Column
	private long fk_employee_id;


}
