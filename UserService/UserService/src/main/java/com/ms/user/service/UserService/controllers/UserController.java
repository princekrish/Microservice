package com.ms.user.service.UserService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.service.UserService.entities.User;
import com.ms.user.service.UserService.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService user_service;
	
	@PostMapping("/create_user")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User user1=user_service.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	@GetMapping("/{user_id}")
	public ResponseEntity<User> getUser(@PathVariable(name ="user_id") String id)
	{
		User user1=user_service.getUser(id);
		 return new ResponseEntity<User>(user1,HttpStatus.FOUND);
	}
	
	
	@GetMapping("/findAllUser")
	public ResponseEntity<List<User>> findAllUsers()
	{
		List<User> all_users=user_service.getAllUser();
		return new ResponseEntity<List<User>>(all_users,HttpStatus.OK);
	}
	
	@GetMapping("deleteUser/{user_id}")
	public String deleteUser(@PathVariable(name="user_id") String s_id)
	{
		user_service.deleteUser(s_id);
		return "User deleted";
	}
	
}
