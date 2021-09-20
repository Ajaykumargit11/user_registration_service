package com.htc.user_registration_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.htc.user_registration_service.dao.UserInterface;
import com.htc.user_registration_service.entity.User;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserInterface userInterface;
	
	
	@GetMapping("/users/{userId}") 
	public User getUserById(@PathVariable Long userId) {
		User user =null;
	
		user=userInterface.findById(userId).get();
		return user;
}
	
	@GetMapping("/users/{userName}")
	public User findByUserName(@RequestParam String userName) {

		return userInterface.findByUserName(userName);
	}
	@GetMapping("/users/{phoneno}")
	public User findByPhoneno(@RequestParam String phoneno) {

		return userInterface.findByPhoneno(phoneno);
	}
	
	@GetMapping("/users/{email}")
	public User findByEmail(@RequestParam String email) {

		return userInterface.findByEmail(email);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userInterface.findAll();
	}
	
	
	@PostMapping("/addusers") 
	public User createUser(@RequestBody User user) {
		   
		 return userInterface.save(user);
	}
	@PutMapping("/users/{userId}")
	User replaceUser(@RequestBody User newUser, @PathVariable Long userId) {
	    
	    return userInterface.findById(userId)
	      .map(user -> {
	    	  user.setPhoneno(newUser.getPhoneno());
	        return userInterface.save(user);
	      })
	      .orElseGet(() -> {
	    	  newUser.setUserId(userId);
	        return userInterface.save(newUser);
	      });
	  }

	@DeleteMapping("/users/{userId}")
	  void deleteUser(@PathVariable Long userId) {
		userInterface.deleteById(userId);
	  }
	
}