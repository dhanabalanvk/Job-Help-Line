/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: UserService.java
 * Date : May 30, 2016
 */
package com.dhana.service;

import java.util.Collection;

import com.dhana.entity.User;
import com.dhana.vo.UserCreateForm;

/**
 * @author DhanabalanV
 *
 */
public interface UserService {
	User getUserById(long id);

//	User getUserByEmail(String email);

	Collection<User> getAllUsers();

	User create(UserCreateForm form);
}
