package com.docker.dockerproject.entity;



public class Employee {
//@jakarta.persistence.Id
	   private int Id;
	   private String name;
	   private int salary;
	   private String post;
	   public Employee(int  Id, String name, int salary, String post) {
		super();
		this.Id = Id;
		this.name = name;
		this.salary = salary;
		this.post = post;
	   }
	   public Employee() {
		super();
	   }
	   public int  getId() {
		   return Id;
	   }
	   public void setId(int  Id) {
		   this.Id = Id;
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
	   public String getPost() {
		   return post;
	   }
	   public void setPost(String post) {
		   this.post = post;
	   }
	   
	

}
