package com.madhav.testapi.controllers;
 class  STUDENT{
	private int roll_no;
	private String name;
	private String course;
	private float marks;
	
	public STUDENT(int roll_no, String name, String course, float marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	public int getRoll_no() {
		return roll_no;
	}
//	public void setRoll_no(int roll_no) {
//		this.roll_no = roll_no;
//	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getCourse() {
		return course;
	}
@Override
	public String toString() {
		return "STUDENT [roll_no=" + roll_no + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	//	public void setCourse(String course) {
//		this.course = course;
//	}
	public float getMarks() {
		return marks;
	}
//	public void setMarks(float marks) {
//		this.marks = marks;
//	}
	
	public void ispassed()
	{
		if(marks>=40)
		{
			System.out.println("STUDENT is passed");
		}
		else {
			System.out.println("STUDENT is failed");
		}
	}
	
}
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STUDENT st=new STUDENT(101,"AMAN","BCA",80);
		System.out.println(st);
		st.ispassed();
		

	}

}
