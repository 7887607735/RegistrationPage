package com.RegistrationForm.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RegistrationForm.Registration.model.User;
import com.RegistrationForm.Registration.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;
	
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	@Override
	public void registerUser() {
		// TODO Auto-generated method stub
		
	}
	
	

}
