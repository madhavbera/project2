package Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="newstudent")
public class NewS {
	@Id
	private int id;
	private String st_name;
	@ManyToMany(mappedBy = "course")
	private List<NewC> newc;
	public NewS(int id, String st_name, List<NewC> newc) {
		super();
		this.id = id;
		this.st_name = st_name;
		this.newc = newc;
	}
	public NewS() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public List<NewC> getNewc() {
		return newc;
	}
	public void setNewc(List<NewC> newc) {
		this.newc = newc;
	}
}
