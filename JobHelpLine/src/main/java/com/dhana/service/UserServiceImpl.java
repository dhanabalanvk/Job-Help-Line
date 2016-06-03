/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: UserServiceImpl.java
 * Date : May 30, 2016
 */
package com.dhana.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.management.relation.RoleResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dhana.entity.User;
import com.dhana.entity.UserRole;
import com.dhana.repository.RoleRepository;
import com.dhana.repository.UserRepository;
import com.dhana.util.Role;
import com.dhana.vo.UserCreateForm;

/**
 * @author DhanabalanV
 *
 */
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final RoleRepository roleRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

	@Autowired
	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dhana.service.UserService#getUserById(long)
	 */
	@Override
	public User getUserById(long id) {
		return userRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dhana.service.UserService#getUserByEmail(java.lang.String)
	 */
	/*
	 * @Override public User getUserByEmail(String email) { return
	 * userRepository.findOneByEmail(email); }
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dhana.service.UserService#getAllUsers()
	 */
	@Override
	public Collection<User> getAllUsers() {
		return userRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dhana.service.UserService#create(com.dhana.vo.UserCreateForm)
	 */
	@Override
	public User create(UserCreateForm form) {
		User user = new User();
		user.setUsername(form.getUserName());
		user.setPassword(bCryptPasswordEncoder.encode(form.getPassword()));
		user.setEnabled(true);
		user.setFirstName(form.getFirstName());
		user.setLastName(form.getLastName());
		user.setEmail(form.getEmail());
		user.setMobileNumber(form.getMobileNumber());
		userRepository.save(user);
		
		UserRole defaultRole = new UserRole();
		defaultRole.setRole("USER");
		defaultRole.setUser(user);
		user.getUserRole().add(defaultRole);
		
		roleRepository.save(defaultRole);
		
		return user;
	}

	private Set<Role> defaultRoles() {
		Set<Role> roles = new HashSet<Role>();
		return roles;
	}
}
