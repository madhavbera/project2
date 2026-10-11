package Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class C {
	@Id
	private int id;
	private String course_name;
//	@ManyToMany(mappedBy ="student")
//	private List<S> student;
	@ManyToMany
	@JoinTable(
			name="student_course",
		    joinColumns=@JoinColumn(name="course_id"),
		    inverseJoinColumns=@JoinColumn(name="student_id")
	)
	private List<S> student;
	public C(int id, String course_name,List<S> st) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.student = st;
	}
	public C() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public List<S> getStudent() {
		return student;
	}
	public void setStudent(List<S> student) {
		this.student = student;
	}
	

}
