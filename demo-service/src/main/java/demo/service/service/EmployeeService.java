package demo.service.service;

import java.util.List;

import demo.service.dto.EmployeeDto;

public interface EmployeeService {

	List<EmployeeDto> getEmployees();

	EmployeeDto getEmployeeById(Integer id);

}
