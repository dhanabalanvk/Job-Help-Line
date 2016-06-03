/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: RoleRepository.java
 * Date : May 31, 2016
 */
package com.dhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhana.entity.UserRole;

/**
 * @author DhanabalanV
 *
 */
public interface RoleRepository extends JpaRepository<UserRole, Long> {

}
