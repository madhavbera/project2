package Entities;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class Myentity {
//	@JsonProperty("id")
	private Integer Id;
	private String name;
	private Integer salary;
	private String post;
	public Myentity( Integer Id,String name, Integer salary,String post) {
		super();
		this.Id = Id;
		this.name = name;
		this.salary = salary;
		this.post=post;
	}
	public Myentity() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Myentity [id=" + Id + ", name=" + name + ", salary=" + salary + ", post=" + post + "]";
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
