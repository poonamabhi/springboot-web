package com.springexample.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springexample.restservices.entities.User;
import com.springexample.restservices.repositories.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	public Optional<User> getUserById(Long id) {
		Optional<User> user= userRepository.findById(id);
		return user;
		
	}
	
	
	public User updateUserById(Long Id,User user) {
		user.setId(Id);
		return userRepository.save(user);
		
		
	}
	
	public void deleteUserById(Long Id) {
		if(userRepository.findById(Id).isPresent()){
			userRepository.deleteById(Id);
			
		}
	}
	
	public User getUserByUsername(String userName) {
		return userRepository.findByUserName(userName);
	}

}
