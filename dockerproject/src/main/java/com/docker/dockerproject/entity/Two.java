package com.docker.dockerproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Two {
	@Id
	private int id;
	private String t_name;
	public Two(int id, String t_name) {
		super();
		this.id = id;
		this.t_name = t_name;
	}
	public Two() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	

}
