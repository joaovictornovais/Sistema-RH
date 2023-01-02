package com.harveey.userapi.resources.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardError {
	
	private LocalDateTime timestamp;
	private String error;
	private Integer status;
	private String path;

}
