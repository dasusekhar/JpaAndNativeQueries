package com.example.aop.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.entity.Admin;
import com.example.aop.entity.Employee;
import com.example.aop.mappings.ClientRequest;
import com.example.aop.mappings.ClientResponse;
import com.example.aop.repository.AdiminRepository;
import com.example.aop.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private AdiminRepository adminRepository;

	@Override
	public Employee saveEmployees(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAll() {
	
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getById(int id) {


		return employeeRepository.findById(id);
	}

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {


	
		Employee emp=employeeRepository.findById(id).get();
		emp.setName(employee.getName());
		emp.setAddress(employee.getAddress());
		emp.setMobile(employee.getMobile());
		emp.setSalary(employee.getSalary());

	
				return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllNative() {


		return employeeRepository.getAllEmployeesNative();
	}

	@Override
	public List<Employee> getByisNative(String name) {

		
		return employeeRepository.getByIdsNative(name);
	}

	@Override
	public List<Employee> getB(int id) {
	
		return employeeRepository.getById(id);
	}

	@Override
	public List<Employee> getByOthers(int id) {
		
		return employeeRepository.getByIdsOthers(id);
	}

	@Override
	public List<Employee> getStarts(String name) {
		
		return employeeRepository.getByFistName(name);
	}
//mappings practice stars
/*
	@Override
	public ClientRequest saveToBoth(ClientRequest client) {
		List<ClientRequest> getAll=new ArrayList<>();
		
		getAll.addAll(getAll)
		
		
		return ;
	}
*/
/*
	@Override
	public ClientRequest saveToBoth(ClientRequest client, Employee employee, Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}
*/
/*
	@Override
	public Admin saveToBoth(Admin admin) {
		
		return adminRepository.saveAll(admin.getEmployees());
	}
*/
/*
	@Override
	public Admin saveAdmin(Admin admin int brachId) {
		
		List<Admin> getIdinsv=adminRepository.findById(id);
		
		
		Employee emp=new Employee();
		employeeRepository.save(emp);
		
		
		
		return adminRepository.save(admin);
	}

	
	*/
	/*
	@Override
	public Admin saveAdmin(Admin admin) {
		Admin get=adminRepository.save(admin);
		List<Admin> str=new ArrayList<>();
		str.add(get);
		 //adminRepository.save(admin
		
		return str;
		*/

	@Override
	public List<Admin> saveAdmin(Admin admin) {
		Admin get=adminRepository.save(admin);
		List<Admin> str=new ArrayList<>();
		if(!str.contains(get))
		{
			str.add(get);
		}
		 //adminRepository.save(admin
		
		return str;
	}



	
	@Override
	public List<ClientResponse> getInfos() {
		
		// List<Employee> getAllth=employeeRepository.findAll();
		 
		
		return adminRepository.getJoinInfo();
	}
	/*

	@Override
	public ClientRequest savetok(List<Employee> list) {
	 Admin ad=adminRepository.save(list);
		
		return  ad;
	}
	*/

	@Override
	public List<Admin> getByBranches(int brachId) {
		//List<Admin> storein=new ArrayList<>();
		//storein.addAll(brachId);
	//	adminRepository.saveAll(brachId);
		//List<Admin> st=new ArrayList<>();
		
		return adminRepository.getByBrachId(brachId);
	}
	/*

	
	@Override
	public List<Admin> updateByBranches(int brachId) 
	{
Admin	getso=adminRepository.findByBrachId(brachId);
List<Admin> vt=new ArrayList<>();
Admin s=new Admin();
getso.setBranchName(s.getBranchName());
vt.add(getso);
vt.add(s);

		
		return   adminRepository.saveAll(vt);
		
		
		*/
/*
	@Override
	public List<Admin> updateByBranches(int brachId) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public List<Employee> getStartsWith(String name) {
		
		return employeeRepository.getByFirstName(name);
	}

	@Override
	public List<Employee> getStartsWithothers(String name) {
	
		return employeeRepository.findByNameStartsWith(name);
	}

	@Override
	public List<Employee> getStartsWithMore() {
		
		return employeeRepository.getSalaryMorthan();
	}

	@Override
	public List<Employee> getStartsWithsss(long salary) {
		List<Employee>sts=employeeRepository.findAll();
	  List<Employee> lists=sts.stream().filter(x->x.getSalary()>salary).collect(Collectors.toList());
	  
		return lists;
	}

	@Override
	public List<Employee> getStartsWithName(String name) {
		List<Employee> getNames=employeeRepository.findAll();
		List<Employee> st1=getNames.stream().filter(x->x.getName().startsWith(name)).collect(Collectors.toList());
		
		return st1;
	}

	@Override
	public List<Employee> getUpdatedTo(int id) {
		List<Employee> getUp=employeeRepository.findAll();
	
		Employee emp=new Employee();
		if(emp.getName()!=null)		{
	emp.setName(emp.getName());
	emp.setAddress(emp.getAddress());
	emp.setMobile(emp.getMobile());
	emp.setSalary(emp.getSalary());
		}
		getUp.add(emp);
		
		return employeeRepository.saveAll(getUp);
		
	}

	@Override
	public Employee updateNews(int id) {
		 Employee getUp=employeeRepository.findById(id).get();
		/*
		Employee emp=new Employee();
		if(emp.getName()!=null)		{
	emp.setName(emp.getName());
	emp.setAddress(emp.getAddress());
	emp.setMobile(emp.getMobile());
	emp.setSalary(emp.getSalary());
		}
		
		*/
		 
		 
			 getUp.setName(getUp.getName());
			 getUp.setAddress(getUp.getAddress());
			 getUp.setMobile(getUp.getMobile());
			 getUp.setSalary(getUp.getSalary());
		 
		return employeeRepository.save(getUp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	

	

	




	
	
	
	

	
	

	
		
	
	



