package com.htc.user_registration_service.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.htc.user_registration_service.dao.UserInterface;
import com.htc.user_registration_service.entity.User;

@Service
public class UserService {
	@Autowired
	private UserInterface userInterface;
	
	@Transactional
	public ResponseEntity<Object> createUserdetails(User user)
	{
		User newUser = new User();
		
		        newUser.setUserId(user.getUserId());
		
		        newUser.setUserName(user.getUserName());
		
		        newUser.setEmail(user.getEmail());
		        newUser.setEmail(user.getEmail());
		
		        User savedUser = userInterface.save(newUser);
				return ResponseEntity.accepted().body(savedUser);
		       
}
}