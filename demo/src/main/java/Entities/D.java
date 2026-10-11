package Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class D {
	@Id
	private int id;
	private String d_name;
//	@OneToMany
//	@JoinColumn(name="department")
//	private List<E> e;
	public D(int id, String d_name) {
		super();
		this.id = id;
		this.d_name = d_name;
	}
	public D() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
//	public List<E> getE() {
//		return e;
//	}
//	public void setE(List<E> e) {
//		this.e = e;
//	}
	

}
