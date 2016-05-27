/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: JobDetails.java
 * Date : May 22, 2016
 */
package com.dhana.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author DHANABALAN
 *
 */
@Entity
@Table(name = "job_details")
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3643090394837918062L;
	@Id
	@GeneratedValue
	@Column(name = "job_id")
	private Long jobId;
	@Column(name = "job_nature")
	private String jobNature;
	@Column(name = "job_location")
	private String jobLocation;
	@Column(name = "exp_level")
	private String expLevel;
	@Column(name = "job_description")
	private String jobDescription;
	@Column(name = "posted_date")
	private Date postedDate;

	/**
	 * @return the jobId
	 */
	public Long getJobId() {
		return jobId;
	}

	/**
	 * @param jobId
	 *            the jobId to set
	 */
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	/**
	 * @return the jobNature
	 */
	public String getJobNature() {
		return jobNature;
	}

	/**
	 * @param jobNature
	 *            the jobNature to set
	 */
	public void setJobNature(String jobNature) {
		this.jobNature = jobNature;
	}

	/**
	 * @return the jobLocation
	 */
	public String getJobLocation() {
		return jobLocation;
	}

	/**
	 * @param jobLocation
	 *            the jobLocation to set
	 */
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	/**
	 * @return the expLevel
	 */
	public String getExpLevel() {
		return expLevel;
	}

	/**
	 * @param expLevel
	 *            the expLevel to set
	 */
	public void setExpLevel(String expLevel) {
		this.expLevel = expLevel;
	}

	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}

	/**
	 * @return the postedDate
	 */
	public Date getPostedDate() {
		return postedDate;
	}

	/**
	 * @param postedDate
	 *            the postedDate to set
	 */
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	/**
	 * @param jobDescription
	 *            the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobDetails other = (JobDetails) obj;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JobDetails [jobId=");
		builder.append(jobId);
		builder.append(", jobNature=");
		builder.append(jobNature);
		builder.append(", jobLocation=");
		builder.append(jobLocation);
		builder.append(", expLevel=");
		builder.append(expLevel);
		builder.append(", jobDescription=");
		builder.append(jobDescription);
		builder.append(", postedDate=");
		builder.append(postedDate);
		builder.append("]");
		return builder.toString();
	}

}
