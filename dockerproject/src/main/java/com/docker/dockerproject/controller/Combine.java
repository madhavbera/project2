package com.docker.dockerproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dockerproject.entity.S1;
import com.docker.dockerproject.entity.S2;
import com.docker.dockerproject.repository.Sarepo;
import com.docker.dockerproject.repository.Srepo;

@RestController
@RequestMapping("/manytomany")
public class Combine {
	private final Srepo srepo;
	private final Sarepo srepo1;
	public Combine(Srepo srepo,Sarepo srepo1)
	{
		this.srepo=srepo;
		this.srepo1=srepo1;
		
	}
	@PostMapping("/insert")
	public String getinsert(@RequestBody List<S2> s)
	{
	    for (S2 obj : s) {
	        srepo1.save(obj);
	    }

		return "Value inserted";
	}
	@PostMapping("/Insert")
	public String getInsert(@RequestBody S2 s)
	{
		srepo1.save(s);
		return "Value Inserted ";
	}

}
