package Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Nc {
	@Id
	private int id;
	private String c_name;

	public Nc(int id, String c_name) {
		super();
		this.id = id;
		this.c_name = c_name;
	}
	
	public Nc() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	
	

}
