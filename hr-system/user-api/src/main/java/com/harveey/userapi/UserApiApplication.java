package com.harveey.userapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.harveey.userapi.domain.User;
import com.harveey.userapi.repositories.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "João Victor", "joao@gmail.com", "123", 30.0)));
	}

}
