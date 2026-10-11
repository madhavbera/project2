package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class E {
	@Id
	private int id;
	private String e_name;
	@ManyToOne
	@JoinColumn(name="D_id")
	private D s;
	public E(int id, String e_name, D s) {
		super();
		this.id = id;
		this.e_name = e_name;
		this.s = s;
	}
	public E() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {	
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public D getS() {
		return s;
	}
	public void setS(D s) {
		this.s = s;
	}
	

}
