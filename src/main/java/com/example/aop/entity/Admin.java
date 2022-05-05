package com.example.aop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name="myadmin")
@Table(name="myadmins")
public class Admin {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue
private int  brachId;
private String branchName;
@ManyToMany(targetEntity=Employee.class, cascade=CascadeType.ALL)
@JoinColumn(name="col_pk",referencedColumnName="brachId")
//referencedColumnName="brachId"
private List<Employee> employees;


public int getBrachId() {
	return brachId;
}
public void setBrachId(int brachId) {
	this.brachId = brachId;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}

public Admin(String branchName, List<Employee> employees) {
	super();
	this.branchName = branchName;
	this.employees = employees;
}
public Admin() {
	super();
}



}
