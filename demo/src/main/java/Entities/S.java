package Entities;

//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class S {
	@Id
	private int id;
	private String student_name;

	public S(int id, String student_name) {
		super();
		this.id = id;
		this.student_name = student_name;
//		this.course = course;
	}
	public S() {
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
//	public List<C> getCourse() {
//		return course;
//	}
//	public void setCourse(List<C> course) {
//		this.course = course;
//	}
	

}
