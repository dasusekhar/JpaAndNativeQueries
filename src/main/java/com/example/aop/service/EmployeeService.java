package com.example.aop.service;

import java.util.List;
import java.util.Optional;

import com.example.aop.entity.Admin;
import com.example.aop.entity.Employee;
import com.example.aop.mappings.ClientRequest;
import com.example.aop.mappings.ClientResponse;

public interface EmployeeService {

	Employee saveEmployees(Employee employee);

	List<Employee> getAll();

	Optional<Employee> getById(int id);

	void deleteById(int id);

	Employee updateEmployee(int id, Employee employee);

	List<Employee> getAllNative();

	List<Employee> getByisNative(String name);

	List<Employee> getB(int id);

	List<Employee> getByOthers(int id);

	//List<Employee> getStarts(String name);

	List<Employee> getStarts(String name);

	//Object saveToBoth(ClientRequest client);

	//Object saveToBoth(Admin admin);

	//Admin saveAdmin(Admin admin);

	//Admin saveAdmin(Admin admin, int brachId);

	List<Admin> saveAdmin(Admin admin);

	List<ClientResponse> getInfos();

	List<Admin> getByBranches(int brachId);

	//List<Admin> updateByBranches(int brachId);

	List<Employee> getStartsWith(String name);

	List<Employee> getStartsWithothers(String name);

	List<Employee> getStartsWithMore();

	List<Employee> getStartsWithsss(long salary);

	List<Employee> getStartsWithName(String name);

	List<Employee> getUpdatedTo(int id);

	



	

	Employee updateNews(int id);

	//ClientRequest savetok(List<Employee> list);

	//ClientRequest savetok(Admin admin);

	

	

	//Admin saveToBoth(ClientRequest client);

	//Admin saveToBoth(Admin admin);

	//ClientRequest saveToBoth(Admin admin);

	//ClientRequest saveToBoth(ClientRequest client);

	//ClientRequest saveToBoth(Admin admin, Employee employee);

	

	//ClientRequest saveToBoth(ClientRequest client, Employee employee, Admin admin);

	//Admin saveToBoth(ClientRequest client);

//	Admin saveToBoth(Admin admin);

//	Admin saveToBoth(ClientRequest client);

	

}
