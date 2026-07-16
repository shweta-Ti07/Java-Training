package com.coforge.Day_06_07_26_CollectionsPrj;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;


public class Employee implements Comparable<Employee> {
	
	private String ename;
	private int eid;
	private String city;
	private String dept;
	private double salary;
	public Employee(String ename, int eid, String city, String dept, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.city = city;
		this.dept = dept;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", city=" + city + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.getDept().compareTo(o.getDept());
	}
	
	
	
	
	
	

}
