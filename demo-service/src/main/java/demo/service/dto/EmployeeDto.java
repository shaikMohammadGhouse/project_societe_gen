package demo.service.dto;


public class EmployeeDto {
	Integer id;
	
	
	String ename;
	
	String designation;
	
	Integer salary;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}
}
