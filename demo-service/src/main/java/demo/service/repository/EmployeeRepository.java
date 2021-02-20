package demo.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import demo.service.dao.EmployeeDao;

public interface EmployeeRepository extends JpaRepository<EmployeeDao, Integer>{

	@Query("select e from EmployeeDao e")
	List<EmployeeDao> getAllEmployees();

}
