package com.example.aop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.entity.Employee;
import com.example.aop.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		Employee saveto=employeeService.saveEmployees(employee);
		return new ResponseEntity<>(saveto,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmp()
	{
		List<Employee> getAll=employeeService.getAll();
		return new ResponseEntity<>(getAll,HttpStatus.OK);
	}
	@GetMapping("/getBy/{id}")
	public ResponseEntity<?> getByIds(@PathVariable int id)
	{
		Optional<Employee> gets=employeeService.getById(id);
		return new ResponseEntity<>(gets,HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/deleteBy/{id}")
	public ResponseEntity<?> deleteById(@PathVariable int id)
	{
		employeeService.deleteById(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/upadate/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable int id ,@RequestBody Employee employee)
	{
		Employee update=employeeService.updateEmployee(id,employee);
		return new ResponseEntity<>(update,HttpStatus.OK);
	}
	@GetMapping("/getMore/{salary}")
	public ResponseEntity<?> getBystarstss(@PathVariable long salary)
	{
		List<Employee> getkosass=employeeService.getStartsWithsss(salary);
		return new ResponseEntity<>(getkosass,HttpStatus.OK);
	}
	@GetMapping("/getName/{name}")
	public ResponseEntity<?> getBystartsWithName(@PathVariable String name)
	{
		List<Employee> getkosassl=employeeService.getStartsWithName(name);
		return new ResponseEntity<>(getkosassl,HttpStatus.OK);
	}
	@GetMapping("/getUpdate/{id}")
	public ResponseEntity<?> getUpdated(@PathVariable int id)
	{
		List<Employee> getkosassop=employeeService.getUpdatedTo(id);
		return new ResponseEntity<>(getkosassop,HttpStatus.OK);
	}
	

}
