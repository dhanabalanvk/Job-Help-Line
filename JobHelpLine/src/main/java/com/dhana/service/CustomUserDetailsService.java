/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: CustomUserDetailsService.java
 * Date : May 31, 2016
 */
package com.dhana.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhana.entity.UserRole;
import com.dhana.repository.UserRepository;

/**
 * @author DhanabalanV
 *
 */
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.dhana.entity.User user = userRepository.findByUsername(username);
		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());

		return buildUserForAuthentication(user, authorities);
	}

	private User buildUserForAuthentication(com.dhana.entity.User user,
			List<GrantedAuthority> authorities) {

		return new User(user.getUsername(), user.getPassword(), true, true, true, true, authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(0);
		for (UserRole userRole : userRoles) {
			authorities.add(new SimpleGrantedAuthority(userRole.getRole()));
		}

		return authorities;
	}
}
