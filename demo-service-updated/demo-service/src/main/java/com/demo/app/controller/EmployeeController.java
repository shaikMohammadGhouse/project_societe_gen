package com.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.dto.EmployeeDto;
import com.demo.app.service.EmployeeService;

import java.util.*;

@RestController("employeeControler")
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/")
	public List<EmployeeDto> getEmployeeList(){
		
		return empService.getEmployees();
		
	}
	
	
	@GetMapping("/{id}")
	public EmployeeDto getEmployee(@PathVariable("id") Integer id){
		
		return empService.getEmployeeById(id);
		
	}
	
}
