package com.harveey.payrollapi.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.harveey.payrollapi.domain.User;

@FeignClient(name = "user-api")
public interface UserFeign {

	@GetMapping("/api/users/{id}")
	ResponseEntity<User> findById(@PathVariable Long id);
	
	@GetMapping
	ResponseEntity<List<User>> findAll();
	
}
