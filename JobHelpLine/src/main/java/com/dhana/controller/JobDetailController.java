/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: JobDetailController.java
 * Date : May 22, 2016
 */
package com.dhana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhana.entity.JobDetails;
import com.dhana.repository.IJobRepository;

/**
 * @author DHANABALAN
 *
 */
@CrossOrigin
@RestController
public class JobDetailController {

	@Autowired
	IJobRepository jobRepo;

	@RequestMapping(value = "/hello.do")
	public String sayHello() {
		return "Sivam";
	}
	
	@RequestMapping(value = "/home.do")
	public String goHome() {
		return "jobs";
	}

	@RequestMapping(value = "/getJob.do/{jobId}", method = RequestMethod.GET)
	public ResponseEntity<JobDetails> getJobDetail(@PathVariable("jobId") long jobId) {
		try {
			JobDetails jobDetail = jobRepo.findOne(jobId);
			return new ResponseEntity<JobDetails>(jobDetail, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<JobDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	@RequestMapping(value = "/getAllJobs.do", method = RequestMethod.GET)
	public ResponseEntity<List<JobDetails>> getAllJobs() {
		try {
			List<JobDetails> jobs = (List<JobDetails>) jobRepo.findAll();
			return new ResponseEntity<List<JobDetails>>(jobs, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<JobDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="/postJob.do",method=RequestMethod.POST)
	public ResponseEntity<JobDetails> postNewJob(@RequestBody JobDetails job) {
		try {
			jobRepo.save(job);
			return new ResponseEntity<JobDetails>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<JobDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
