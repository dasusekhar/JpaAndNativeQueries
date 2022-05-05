package com.example.aop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.aop.entity.Admin;
import com.example.aop.entity.Employee;
import com.example.aop.mappings.ClientRequest;
//import com.example.aop.entity.Employee;
//import com.example.aop.mappings.*;
import com.example.aop.mappings.ClientResponse;

@Repository
public interface AdiminRepository extends JpaRepository<Admin,Integer>{

	//ClientRequest save(ClientRequest client);
   @Query("select new  com.example.aop.mappings.ClientResponse (c.branchName,e.name) from Admin c join c.employees e")
	public   List<ClientResponse> getJoinInfo();

public List<Admin> getByBrachId(int brachId);

public Admin findByBrachId(int brachId);

//public ClientRequest save(List<Employee> employees);




	

	
	
//	Admin saveAll(ClientRequest client);

	



}
