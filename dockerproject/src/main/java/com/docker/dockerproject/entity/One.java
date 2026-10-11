package com.docker.dockerproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class One {
	@Id
	private int id;
	private String name;
	@OneToOne
	private Two tw;
	public One(int id, String name, Two tw) {
		super();
		this.id = id;
		this.name = name;
		this.tw = tw;
	}
	public One() {
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
	public Two getTw() {
		return tw;
	}
	public void setTw(Two tw) {
		this.tw = tw;
	}
	

}
