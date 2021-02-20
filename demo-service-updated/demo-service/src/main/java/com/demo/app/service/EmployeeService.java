package com.demo.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.app.dto.EmployeeDto;

@Service
public interface EmployeeService {

	List<EmployeeDto> getEmployees();

	EmployeeDto getEmployeeById(Integer id);

}
