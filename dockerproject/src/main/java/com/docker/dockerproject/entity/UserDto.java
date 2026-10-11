package com.docker.dockerproject.entity;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDto {
	private String name;
	private String password;
	private String role;
	public UserDto(String name, String password, String role) {
		super();
		this.name = name;
		this.password = password;
		this.role = role;
	}
	public UserDto() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
         
}
