package com.harveey.userapi.services;

import java.util.List;

import com.harveey.userapi.domain.User;

public interface UserService {

	User findById(Long id);
	List<User> findAll();
	
}
