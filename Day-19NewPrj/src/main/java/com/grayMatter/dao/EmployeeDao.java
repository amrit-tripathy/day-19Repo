package com.grayMatter.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.grayMatter.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int addEmployee(Employee emp) {
		String query="INSERT INTO Employee VALUES ("+emp.getId()+",'"+emp.getEmpName()+"',"+emp.getEmpSal()+");";
		return jdbcTemplate.update(query);
	}
	public List<Employee> getAllEmployee(){
		String query = "SELECT * FROM Employee";
		List<Employee> empList = jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList;
	}
	public int updateEmployee(Employee emp) {
		String query="UPDATE Employee SET empSal="+emp.getEmpSal()+"WHERE empID="+emp.getId();
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(int id) {
		String query="delete from Employee where empID="+id+";";
		return jdbcTemplate.update(query);
	}

}
