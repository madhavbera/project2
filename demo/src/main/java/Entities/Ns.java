package Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="newstudents")
public class Ns {
	@Id
	private int id;
	private String student_name;
	@ManyToMany
	@JoinTable(
			name="st_cr",
			joinColumns = @JoinColumn(name="st_id"),
			inverseJoinColumns = @JoinColumn(name="cr_id")
			)
	private List<Nc> nc;
	public Ns(int id, String student_name, List<Nc> nc) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.nc = nc;
	}
	public Ns() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public List<Nc> getNc() {
		return nc;
	}
	public void setNc(List<Nc> nc) {
		this.nc = nc;
	}
}
