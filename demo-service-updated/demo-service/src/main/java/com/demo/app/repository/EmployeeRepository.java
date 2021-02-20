package com.demo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.app.dao.EmployeeDao;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDao, Integer>{

	@Query("select e from EmployeeDao e")
	List<EmployeeDao> getAllEmployees();

}
