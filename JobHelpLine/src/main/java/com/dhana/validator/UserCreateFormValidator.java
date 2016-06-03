/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: UserCreateFormValidator.java
 * Date : May 30, 2016
 */
package com.dhana.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.dhana.entity.User;
import com.dhana.service.UserService;
import com.dhana.vo.UserCreateForm;

/**
 * @author DhanabalanV
 *
 */
@Component
public class UserCreateFormValidator implements Validator {
	private final UserService userService;

	@Autowired
	public UserCreateFormValidator(UserService userService) {
		this.userService = userService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserCreateForm form = (UserCreateForm) target;
		validatePasswords(errors, form);
		validateEmail(errors, form);
	}

	private void validatePasswords(Errors errors, UserCreateForm form) {
		if (!form.getPassword().equals(form.getPasswordRepeated())) {
			errors.reject("password.not_match", "Password do not match");
		}
	}

	private void validateEmail(Errors errors, UserCreateForm form) {
		/*if (null != userService.getUserByEmail(form.getEmail())) {
			errors.reject("email.exists", "User with this email already exists");
		}*/
	}
}
