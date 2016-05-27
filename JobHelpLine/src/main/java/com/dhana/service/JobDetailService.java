/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: JobDetailService.java
 * Date : May 22, 2016
 */
package com.dhana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhana.repository.IJobRepository;
import com.dhana.vo.JobDetailsVO;

/**
 * @author DHANABALAN
 *
 */
public class JobDetailService implements IJobDetailService {

	IJobRepository jobRepo;
	
	/* (non-Javadoc)
	 * @see com.dhana.service.IJobDetailService#getJobDetails(java.lang.Long)
	 */
	@Override
	public JobDetailsVO getJobDetails(Long jobId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.dhana.service.IJobDetailService#detelteJob(java.lang.Long)
	 */
	@Override
	public void detelteJob(Long jobId) throws Exception {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.dhana.service.IJobDetailService#getAllJobs()
	 */
	@Override
	public List<JobDetailsVO> getAllJobs() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
