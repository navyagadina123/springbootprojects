package com.capgemini.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Created table directly in the database
@Entity
@Table(name="Employee_details")
public class Employee {
    
	//Set the Id as a primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Emp_id")
	private int id;
	
	@Column(name="Emp_name")
	private String name;
	
	@Column(name="Emp_salary")
	private long salary;
	
	@Column(name="Emp_location")
	private String location;
	
	@Column(name="Emp_contactNo")
	private String contactNo;
	
	@Column(name="Emp_password")
	private String password;
	
	//Default Constructor to address the class
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor initialize the values
	public Employee(int id, String name, long salary, String location, String contactNo, String password) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
		this.contactNo = contactNo;
		this.password = password;
	}

	///Getter and Setter method to get and set the data
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
