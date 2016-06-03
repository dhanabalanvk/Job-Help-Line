/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: SecurityConfiguration.java
 * Date : May 30, 2016
 */
package com.dhana.config;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author DhanabalanV
 *
 */
@Configuration
@EnableWebMvcSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	@Qualifier("customUserDetailsService")
	private UserDetailsService customUserDetailsService;
	
	@Autowired
	DataSource dataSource;
	


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
            .antMatchers("/","/home").authenticated()
            .and()
        .formLogin()
            .loginPage("/login")
            .defaultSuccessUrl("/home")
            .permitAll()
            .and()
        .logout()
            .permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(dataSource)
		.passwordEncoder(passwordEncoder())
		.usersByUsernameQuery(
			"select username,password, enabled, first_name, last_name, mobile_number from users where username=?")
		.authoritiesByUsernameQuery(
			"select username, role from user_roles where username=?");
		
	/*	auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select username,password, enabled from users where username=?")
		.authoritiesByUsernameQuery("select username, role from user_roles where username=?");*/

//		auth.userDetailsService(customUserDetailsService);
		
		// In case of password encryption - for production site
		//auth.userDetailsService(customerUserDetailsService).passwordEncoder(passwordEncoder());
	}
	
	
	@Bean
	public FilterRegistrationBean getSpringSecurityFilterChainBindedToError(
	                @Qualifier("springSecurityFilterChain") Filter springSecurityFilterChain) {

	        FilterRegistrationBean registration = new FilterRegistrationBean();
	        registration.setFilter(springSecurityFilterChain);
	        registration.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
	        return registration;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

}
