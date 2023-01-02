package com.harveey.payrollapi.services;

import java.util.Objects;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.harveey.payrollapi.domain.Payroll;
import com.harveey.payrollapi.feignClients.UserFeign;
import com.harveey.payrollapi.services.exceptions.ObjectNotFoundException;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class PayrollServices {
	
	private final Environment env;
	private final UserFeign feign;
	
	public Payroll getPayment(Long workerId, Payroll payroll) {
		log.info("PAYROLL_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port" );
		try {
			var user = feign.findById(workerId).getBody();
			
			if (Objects.nonNull(user)) {
				return new Payroll(
						user.getName(),
						payroll.getDescription(),
						user.getHourlyPrice(),
						payroll.getWorkedHours(),
						payroll.getWorkedHours() * user.getHourlyPrice());
			}
			
		} catch (FeignException.NotFound e) {
			throw new ObjectNotFoundException("Object not found");
		} catch (Exception e) {
			throw new IllegalArgumentException("Illegal Argument Exception");
		}
		return null;
	}
}
