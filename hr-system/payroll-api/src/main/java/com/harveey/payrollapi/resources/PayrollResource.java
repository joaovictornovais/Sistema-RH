package com.harveey.payrollapi.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harveey.payrollapi.domain.Payroll;
import com.harveey.payrollapi.domain.User;
import com.harveey.payrollapi.feignClients.UserFeign;
import com.harveey.payrollapi.services.PayrollServices;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PayrollResource {
	
	private final PayrollServices service;
	
	@GetMapping("/{workerId}")
	public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {
		
		return ResponseEntity.ok().body(service.getPayment(workerId, payment));
	}
	
}
