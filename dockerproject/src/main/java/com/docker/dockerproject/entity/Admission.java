package com.docker.dockerproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admission")
public class Admission {
	@Id
	private long id;
	private String name;
	private String class_name;
	private long roll_no;
	public Admission(long id, String name, String class_name, long roll_no) {
		super();
		this.id = id;
		this.name = name;
		this.class_name = class_name;
		this.roll_no = roll_no;
	}
	public Admission() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public long getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(long roll_no) {
		this.roll_no = roll_no;
	}
	
	

}
