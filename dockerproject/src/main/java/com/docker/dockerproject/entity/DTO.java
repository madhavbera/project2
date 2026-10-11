package com.docker.dockerproject.entity;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DTO {
	private String name;
	private int salary;
	private String post;
	public DTO(String name, int salary, String post) {
		super();
		this.name = name;
		this.salary = salary;
		this.post = post;
	}
	public DTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	

}
