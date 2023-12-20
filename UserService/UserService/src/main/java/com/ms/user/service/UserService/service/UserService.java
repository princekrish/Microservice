package com.ms.user.service.UserService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ms.user.service.UserService.entities.User;


public interface UserService {

	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userID);
	
	 void deleteUser(String userId);
}
