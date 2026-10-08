package com.dockercontainer.place.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserDB {
	@Id
	private int id;
	private String name;
	private String Password;
	private String roles;
	public UserDB(int id, String name, String password, String roles) {
		super();
		this.id = id;
		this.name = name;
		Password = password;
		this.roles = roles;
	}
	public UserDB() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	

}
