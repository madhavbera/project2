package com.madhav.testapi.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Class {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String className;
	
	@OneToMany(mappedBy = "class_id", cascade = CascadeType.ALL)
	private List<Student> students;
	
	
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class(String className) {
		super();
		this.className = className;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	

}
