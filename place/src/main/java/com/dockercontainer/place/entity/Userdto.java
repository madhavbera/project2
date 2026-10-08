package com.dockercontainer.place.entity;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Userdto {
	private String name;
	private String password;
	private String roles;
	public Userdto(String name, String password, String roles) {
		super();
		this.name = name;
		this.password = password;
		this.roles = roles;
	}
	public Userdto() {
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
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	

}
