/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: IJobDetailService.java
 * Date : May 22, 2016
 */
package com.dhana.service;

import java.util.List;

import com.dhana.vo.JobDetailsVO;

/**
 * @author DHANABALAN
 *
 */
public interface IJobDetailService {
	public JobDetailsVO getJobDetails(Long jobId) throws Exception;
	public void detelteJob(Long jobId) throws Exception;
	public List<JobDetailsVO> getAllJobs() throws Exception;
	
}
