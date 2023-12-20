package com.ms.user.service.UserService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.ms.user.service.UserService.exceptions.ResourceNotFoundException;
import com.ms.user.service.UserService.entities.User;
import com.ms.user.service.UserService.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	 private UserRepository user_repository;

	@Override
	public User saveUser(User user) {
	
		return user_repository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		
		return user_repository.findAll();
	}

	@Override
	public User getUser(String userID) {
	return	user_repository.findById(userID).orElseThrow(()->new ResourceNotFoundException("user with given id not found on server :"+userID ));
			
	}

	@Override
	public void deleteUser(String userId) {
		user_repository.deleteById(userId);
		
	}

}
