package com.docker.dockerproject.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="s")
public class S1 {
	@Id
	private int id;
	private String s_name;
	@ManyToMany
	@JoinTable(
			name="s1_s2",
			joinColumns = @JoinColumn(name="s1_id")
			,
			inverseJoinColumns = @JoinColumn(name="s2_id")
			)
	private List<S2> ls;
	public S1(int id, String s_name, List<S2> ls) {
		super();
		this.id = id;
		this.s_name = s_name;
		this.ls = ls;
	}
	public S1() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public List<S2> getLs() {
		return ls;
	}
	public void setLs(List<S2> ls) {
		this.ls = ls;
	}
	

}
