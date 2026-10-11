package com.docker.dockerproject.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dockerproject.entity.Admission;
import com.docker.dockerproject.exception.Exception;
import com.docker.dockerproject.repository.Adrepo;

@RestController
@RequestMapping("/Admission")
public class Adcontroller {
	@Autowired
	Adrepo arepo;
	@PutMapping("/admission/open")
	public String getadmit(@RequestBody Admission ad)
	{
		arepo.save(ad);
		return "Admission successfully";
	}
	@GetMapping("/candidate")
	public List<Admission> getallcandidate()
	{
		return arepo.findAll();
	}
	@GetMapping("/getsinglecandidate/{id}")
	public ResponseEntity<?> getdata(@PathVariable long id)
	{
		Admission ad=arepo.findById(id).orElseThrow(()->new Exception("Id not found at "+id));
		return ResponseEntity.ok(ad);
		
	}
	@ExceptionHandler()
	public ResponseEntity<?> gethandle(Exception ex)
	{
		Map<String, Object> map=new HashMap<>();
		map.put("Error:", ex.getMessage());
		map.put("Time:",LocalDateTime.now());
		map.put("status:", HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
	}

}
