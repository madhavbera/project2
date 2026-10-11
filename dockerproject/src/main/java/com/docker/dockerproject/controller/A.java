package com.docker.dockerproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dockerproject.entity.One;
import com.docker.dockerproject.entity.Two;
import com.docker.dockerproject.exception.Exception;
import com.docker.dockerproject.exception.Globalexcepion;
import com.docker.dockerproject.repository.Onerepo;
import com.docker.dockerproject.repository.Tworepo;

@RestController
@RequestMapping("/onetoone")
public class A {
//	@Autowired //field injection
//	Onerepo repo;
	@Autowired
	Tworepo trepo;
	private final Onerepo repo;//constructor injection
	public A(Onerepo repo)
	{
		this.repo=repo;
	}
	
	@PostMapping()
	public String getdata(@RequestBody One o)
	{
		repo.save(o);
		return "data insert";
	}
	@PostMapping("/data")
	public String postdata(@RequestBody Two t)
	{
		trepo.save(t);
		return "Posted successfully";
	}
	@GetMapping("/DATA/{id}")
	public ResponseEntity<?> getall(@PathVariable int id)
	{
		One o=repo.findById(id).orElseThrow(()->new Exception("Id not found at "+id));
		return ResponseEntity.ok(o );
	}
	@GetMapping("/All")
	public List<One> getALL()
	{
		return repo.findAll();
	}

}
