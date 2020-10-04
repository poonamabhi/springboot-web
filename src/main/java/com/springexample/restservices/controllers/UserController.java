package com.springexample.restservices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springexample.restservices.entities.User;
import com.springexample.restservices.services.UserService;
//controller
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/users/{Id}")
	public Optional<User> getUsersById(@PathVariable("Id")Long Id){
		return userService.getUserById(Id);
	}
	
	@PutMapping("/users/{Id}")
	public User updateUserById(@PathVariable("Id") Long Id, @RequestBody User user) {
		return userService.updateUserById(Id, user);
	}

	@DeleteMapping("/users/{Id}")
	public void deleteUserById(@PathVariable("Id") Long Id) {
		userService.deleteUserById(Id);
	}
	
	@GetMapping("/users/byUserName/{userName}")
	public User getUserByUsername(@PathVariable("userName")String userName ){
		return userService.getUserByUsername(userName);
	}
}
