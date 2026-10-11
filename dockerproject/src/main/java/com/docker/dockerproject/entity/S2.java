package com.docker.dockerproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class S2 {
	@Id
	private int id;
	private String s2_name;
	@ManyToMany(mappedBy = "ls")
	private List<S1> ls;
	public S2(int id, String s2_name, List<S1> ls) {
		super();
		this.id = id;
		this.s2_name = s2_name;
		this.ls = ls;
	}
	public S2() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS2_name() {
		return s2_name;
	}
	public void setS2_name(String s2_name) {
		this.s2_name = s2_name;
	}
	public List<S1> getLs() {
		return ls;
	}
	public void setLs(List<S1> ls) {
		this.ls = ls;
	}
	

}
