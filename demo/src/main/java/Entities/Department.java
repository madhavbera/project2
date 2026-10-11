package Entities;

public class Department {
	private int id;
	private String department_name;
	private String employee_name;
	public Department( String Department_name, String Employee_name) {
		super();
//		this.id = id;
		this.department_name = Department_name;
	this.employee_name = Employee_name;
	}
	public Department() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String Department_name) {
		this.department_name = Department_name;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String Employee_name) {
		this.employee_name = Employee_name;
	}
	

}
