package com.example.aop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name="mycollege")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private String address;
private String mobile;
private  long salary;




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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public Employee(int id, String name, String address, String mobile, long salary) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.mobile = mobile;
	this.salary = salary;
}
public Employee() {
	super();
}


}
