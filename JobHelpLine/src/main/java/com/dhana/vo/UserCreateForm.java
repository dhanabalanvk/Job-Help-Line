/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: UserCreateForm.java
 * Date : May 30, 2016
 */
package com.dhana.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.dhana.util.Role;

/**
 * @author DhanabalanV
 *
 */
public class UserCreateForm {
	@NotEmpty
	private String userName;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;

	@NotEmpty
	private String password = "";
	@NotEmpty
	private String passwordRepeated = "";
	@NotEmpty
	private String email;
	@NotNull
	private Long mobileNumber;
	private Role role = Role.USER;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRepeated() {
		return passwordRepeated;
	}

	public void setPasswordRepeated(String passwordRepeated) {
		this.passwordRepeated = passwordRepeated;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
