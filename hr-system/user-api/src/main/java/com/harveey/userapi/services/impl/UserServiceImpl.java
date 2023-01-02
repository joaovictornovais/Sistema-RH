package com.harveey.userapi.services.impl;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.harveey.userapi.domain.User;
import com.harveey.userapi.repositories.UserRepository;
import com.harveey.userapi.services.UserService;
import com.harveey.userapi.services.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final Environment env;
	private final UserRepository repository;

	@Override
	public User findById(Long id) {
		log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port" );
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}
	
}
