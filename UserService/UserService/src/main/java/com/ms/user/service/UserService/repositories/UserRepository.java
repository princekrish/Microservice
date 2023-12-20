package com.ms.user.service.UserService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.user.service.UserService.entities.User;

@Repository
public interface UserRepository  extends JpaRepository<User, String>{

}
