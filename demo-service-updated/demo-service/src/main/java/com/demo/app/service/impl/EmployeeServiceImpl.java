package com.demo.app.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.dao.EmployeeDao;
import com.demo.app.dto.EmployeeDto;
import com.demo.app.repository.EmployeeRepository;
import com.demo.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public List<EmployeeDto> getEmployees() {
		
		List<EmployeeDao> employees=empRepo.getAllEmployees();
		List<EmployeeDto> employeeDtoLit=new ArrayList<>();
		employees.forEach(empDao->
		
				{
					EmployeeDto empDto=new EmployeeDto();
					empDto.setId(empDao.getId());
					empDto.setEname(empDao.getEname());
					empDto.setSalary(empDao.getSalary());
					empDto.setDesignation(empDao.getDesignation());
					employeeDtoLit.add(empDto);
				});
		return employeeDtoLit;
	}

	@Override
	public EmployeeDto getEmployeeById(Integer id) {
		
		EmployeeDto empDto=new EmployeeDto();
		
		Optional<EmployeeDao> empDao=empRepo.findById(id);
		
		if(empDao.isPresent())
		{
			empDto.setId(empDao.get().getId());
			empDto.setEname(empDao.get().getEname());
			empDto.setSalary(empDao.get().getSalary());
			empDto.setDesignation(empDao.get().getDesignation());
		}
		return empDto;
	}

}
