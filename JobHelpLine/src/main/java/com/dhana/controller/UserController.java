/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: UserController.java
 * Date : May 30, 2016
 */
package com.dhana.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dhana.service.UserService;
import com.dhana.validator.UserCreateFormValidator;
import com.dhana.vo.UserCreateForm;

/**
 * @author DhanabalanV
 *
 */
@Controller
public class UserController {
	private final UserService userService;
	private final UserCreateFormValidator userCreateFormValidator;

	@Autowired
	public UserController(UserService userService, UserCreateFormValidator userCreateFormValidator) {
		this.userService = userService;
		this.userCreateFormValidator = userCreateFormValidator;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(userCreateFormValidator);
	}
	
	@RequestMapping(value="/user/register", method=RequestMethod.POST)
	public void registerUser(@Valid @ModelAttribute("form") UserCreateForm form, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			System.out.println("Error "+bindingResult.getAllErrors());
		}else{
			userService.create(form);
		}
	}
	
	
	
	/*@RequestMapping(name="/",method=RequestMethod.GET)
	public String showLogin(){
		return "login";
	}*/
	
	/*@RequestMapping(name="/signUp.do")
	public String showSighUp(){
		return "registration";
	}*/
	
	/*@RequestMapping(name="/signUp.do")
	public String showRegistrationForm(Model model){
		model.addAttribute("name","sivasakthi");
		return "registration";
	}*/
}
