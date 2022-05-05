package com.example.aop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.aop.entity.Admin;
import com.example.aop.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	@Query(value="select * from mycollege" ,nativeQuery=true)
	List<Employee> getAllEmployeesNative();
	@Query(value="select  * from mycollege where name=?1",nativeQuery=true)
public 	List<Employee> getByIdsNative(String  name);
	@Query("from mycollege where id=?1")
	List<Employee> getById(int id);
	
	@Query(value="select * from mycollege where id = :id",nativeQuery=true)
	List<Employee> getByIdsOthers(@Param("id") int id);
	@Query(value="select * from mycollege where name like '%name'",nativeQuery=true)
	List<Employee> getByFistName(@Param("name") String name);
	//@Query(value="select * from mycollege where name like 'k%'  ",nativeQuery=true)
	@Query(value="select * from mycollege where name like '?%'  ",nativeQuery=true)
	List<Employee> getByFirstName(@Param("?") String name);
	List<Employee> findByNameStartsWith(String name);
	@Query(value="select * from mycollege where salary>70000",nativeQuery=true)
	List<Employee> getSalaryMorthan();
	
	List<Employee> findBySalary(long salary);
	
	
	
	

}
