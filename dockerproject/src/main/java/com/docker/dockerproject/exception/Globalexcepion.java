package com.docker.dockerproject.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class Globalexcepion {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handle(Exception ex)
	{
		Map<String , Object> map=new HashMap<>();
		map.put("ERROR",ex.getMessage());
		map.put("Time", LocalDateTime.now());
		map.put("status", HttpStatus.NOT_FOUND.value());
		return ResponseEntity.ok(map);
	}
	@ExceptionHandler(HttpClientErrorException.NotFound.class)
	public ResponseEntity<?> handleexc(HttpClientErrorException.NotFound ex)
	{
		Map<String , Object> map =new HashMap<>();
		map.put("ERROR:", "Id Not found");
		map.put("time:", LocalDateTime.now());
		map.put("status:", HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
	}
}
