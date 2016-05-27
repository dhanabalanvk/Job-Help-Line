/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: JobDetailsVO.java
 * Date : May 22, 2016
 */
package com.dhana.vo;

import java.util.Date;

/**
 * @author DHANABALAN
 *
 */
public class JobDetailsVO {
	private long jobId;
	private String jobNature;
	private String jobLocation;
	private String expLevel;
	private String jobDescription;
	private Date postedDate;

	/**
	 * @return the jobId
	 */
	public long getJobId() {
		return jobId;
	}

	/**
	 * @param jobId
	 *            the jobId to set
	 */
	public void setJobId(long jobId) {
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
	 * @param jobDescription
	 *            the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
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

}
