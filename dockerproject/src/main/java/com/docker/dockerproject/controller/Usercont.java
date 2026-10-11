package com.docker.dockerproject.controller;

import java.beans.Encoder;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dockerproject.entity.UserDto;
import com.docker.dockerproject.entity.Userinfo;
import com.docker.dockerproject.repository.Userinforepo;


@RestController
@RequestMapping("/user-info")
public class Usercont {
	private final Userinforepo userrepo;
	private final PasswordEncoder encoder;
	public Usercont(Userinforepo userrepo,PasswordEncoder encode) {
		this.userrepo=userrepo;
		this.encoder=encode;
	}
	@PostMapping("/Data/{id}")
	public String getdata(@RequestBody UserDto info,@PathVariable int id)
	{
		Userinfo us=new Userinfo();
		us.setId(id);
	us.setName(info.getName());
	us.setPassword((String)encoder.encode(info.getPassword()));
	us.setRole(info.getRole());
	userrepo.save(us);
	return "Sign up successfully!";
	}

}
