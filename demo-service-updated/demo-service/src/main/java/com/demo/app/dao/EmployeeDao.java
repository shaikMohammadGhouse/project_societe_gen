package com.demo.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeDao {

		@Column(name = "id", nullable = false, unique = true)
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Id
		Integer id;
		
		
		@Column(name = "ename",nullable=false, length=20, columnDefinition = "Varchar(20)")
		String ename;
		
		@Column(name = "designation",  length=40, columnDefinition = "Varchar(40)")
		String designation;
		
		@Column(name = "salary", columnDefinition = "decimal(10)")
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

	public EmployeeDao(String ename, String designation, Integer salary) {
		super();
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;
	}
	public EmployeeDao()
	{
		super();
	}
	
	

}
