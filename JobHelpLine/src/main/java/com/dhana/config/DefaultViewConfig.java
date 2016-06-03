/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: DefaultViewConfig.java
 * Date : May 30, 2016
 */
package com.dhana.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author DhanabalanV
 *
 */
@Configuration
public class DefaultViewConfig extends WebMvcConfigurerAdapter {

	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login").setViewName("login");
	}
	
}
