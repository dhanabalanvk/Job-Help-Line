/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: IJobRepository.java
 * Date : May 22, 2016
 */
package com.dhana.repository;

import org.springframework.data.repository.CrudRepository;

import com.dhana.entity.JobDetails;

/**
 * @author DHANABALAN
 *
 */
public interface IJobRepository extends CrudRepository<JobDetails, Long> {

}
