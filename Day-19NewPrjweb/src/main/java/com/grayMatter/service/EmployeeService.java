package com.grayMatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grayMatter.dao.EmployeeDao;
import com.grayMatter.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empdao;
	
	public List<Employee> getAllEmployees(){
		return empdao.getAllEmployee();
	}
	public int addEmployee(Employee e) {
		return empdao.addEmployee(e);
	}
	
	public int updateEmployee(int id,int salary) {
		return empdao.updateEmployee(id,salary);
	}
	public Employee getEmployeeByid(int empid) {
		return empdao.getEmployeeByid(empid);
	}
	public int deleteEmployee(int empid) {
		return empdao.deleteEmployee(empid);
	}
}
