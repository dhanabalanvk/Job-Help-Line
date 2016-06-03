/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: UserRepository.java
 * Date : May 30, 2016
 */
package com.dhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhana.entity.User;

/**
 * @author DhanabalanV
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String userName);
}
