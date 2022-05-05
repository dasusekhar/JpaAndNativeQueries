package com.example.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.entity.Admin;
import com.example.aop.entity.Employee;
import com.example.aop.mappings.ClientRequest;
import com.example.aop.mappings.ClientResponse;
import com.example.aop.service.EmployeeService;

@RestController
@RequestMapping("/mappings")
public class MappingsController {
	@Autowired
	private EmployeeService employeeService;
/*
	public ResponseEntity<?>saveAllAdiminAndEmployees(@RequestBody ClientRequest client)
	{
		
		return new ResponseEntity<>( employeeService.saveToBoth(client.getAdmin()),HttpStatus.ACCEPTED);
	}
	*/
	@PostMapping("/saveAdmin")
	public ResponseEntity<?>saveAllAdiminAndEmployees(@RequestBody Admin admin  )
	{
		List<Admin> saveAdmin=employeeService.saveAdmin(admin);
		return new ResponseEntity<>( saveAdmin,HttpStatus.ACCEPTED);
	}
	@GetMapping("/getInfo")
	public ResponseEntity<List<?>> getAllInfos()
	{
		List<ClientResponse> getvv=employeeService.getInfos();
		System.out.println(getvv);	
		return new ResponseEntity<>(getvv,HttpStatus.OK);
	}
	/*
	@PostMapping("/savek")
	public ResponseEntity<?>saveToBothsYah(@RequestBody Admin admin)
	{
		ClientRequest saves=employeeService.savetok(admin.getEmployees());
		return new ResponseEntity<>(saves,HttpStatus.OK);
	}
	*/
	@GetMapping("/getByBranch/{brachId}")
	public ResponseEntity<List<?>>getByBranchName(@PathVariable("brachId") int brachId)
	{
		  List<Admin>getcom=employeeService.getByBranches(brachId);
		
		return new ResponseEntity<>(getcom,HttpStatus.OK);
	}
	/*
	@PutMapping("update/{brachId}")
	public ResponseEntity<?>updateByBranchName(@PathVariable("brachId") int brachId)
	{
		  List<Admin> getcoms=employeeService.updateByBranches(brachId);
		
		return new ResponseEntity<>(getcoms,HttpStatus.OK);
	}
	*/
}
