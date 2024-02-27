package com.RegistrationForm.Registration.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="UserRegister")
public class User {
	
	private String name;
	@Id
	private String username;
	private String email;
	private String phone;
	private String gender;
	private String password;
	private String Confirm_Password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String username, String email, String phone, String gender, String password,
			String confirm_Password) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.password = password;
		Confirm_Password = confirm_Password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_Password() {
		return Confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", email=" + email + ", phone=" + phone + ", gender="
				+ gender + ", password=" + password + ", Confirm_Password=" + Confirm_Password + "]";
	}
	

}
