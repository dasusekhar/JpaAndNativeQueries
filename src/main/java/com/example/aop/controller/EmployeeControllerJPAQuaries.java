package com.example.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.entity.Employee;
import com.example.aop.service.EmployeeService;

@RestController
@RequestMapping("/jpa")
public class EmployeeControllerJPAQuaries {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getNative")
	public ResponseEntity<?> getAll(@RequestBody Employee employee)
	{
		List<Employee> getNativeQueries=employeeService.getAllNative();
		return new ResponseEntity<>(getNativeQueries,HttpStatus.OK);
	}
	
	@GetMapping("/getById")
	public ResponseEntity<?> getAll(@RequestParam  String name)
	{
		List<Employee> getNativeQueries=employeeService.getByisNative(name);
		return new ResponseEntity<>(getNativeQueries,HttpStatus.OK);
	}
	
	@GetMapping("/getByIdData")
	public ResponseEntity<?> getAll(@RequestParam int  id)
	{
		List<Employee> getssNativeQueries=employeeService.getB(id);
		return new ResponseEntity<>(getssNativeQueries,HttpStatus.OK);
	}
	
	@GetMapping("/getByIdOthers/{id}")
	public ResponseEntity<?> getBys(@PathVariable  int  id)
	{
		List<Employee> getsbsNativeQueries=employeeService.getByOthers(id);
		return new ResponseEntity<>(getsbsNativeQueries,HttpStatus.OK);
	}

@GetMapping("starts/{name}")	
public ResponseEntity<?> getByNameStarts(@RequestParam String name)
{
	List<Employee> getsv=employeeService.getStarts(name);
	
	return new ResponseEntity<>(getsv,HttpStatus.OK);
}
@GetMapping("/data/{name}")
public ResponseEntity<?> getBystarst(@PathVariable("name") String name)
{
	List<Employee> getkosa=employeeService.getStartsWith(name);
	return new ResponseEntity<>(getkosa,HttpStatus.OK);
}
@GetMapping("/sa/{name}")
public ResponseEntity<?> getBystarstv(@PathVariable("name") String name)
{
	List<Employee> getkosas=employeeService.getStartsWithothers(name);
	return new ResponseEntity<>(getkosas,HttpStatus.OK);
}
@GetMapping("/more")
public ResponseEntity<?> getBystarst()
{
	List<Employee> getkosal=employeeService.getStartsWithMore();
	return new ResponseEntity<>(getkosal,HttpStatus.OK);
}
@PutMapping("/updateNew/{id}")
public ResponseEntity<?> updateNew(@PathVariable("id") int id)
{
	Employee update=employeeService.updateNews(id);
	return new ResponseEntity<>(update,HttpStatus.ACCEPTED);
}

}
