package com.grayMatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.grayMatter.model.Employee;

import lombok.Setter;

@Setter
@Component
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	public int addEmployee(Employee e) {
		String query="insert into employee values("+e.getEmpId()+",'"+e.getEmpName()+"'," +e.getEmpSal()+");";    
		return jdbctemplate.update(query);
	}
	public List<Employee>getAllEmployee(){
		String query="select * from Employee;";
		List<Employee> emplist=jdbctemplate.query(query, new EmployeeRowMapper());
		return emplist;
	}
	public int deleteEmployee(int id) {
		String query="delete from employee where empID="+id+";";
		return jdbctemplate.update(query);
	}
	public int updateEmployee(int id,int salary) {
		String query = "update Employee set empSal="+salary+" where empID="+id+";";
		return jdbctemplate.update(query);
	}
	public Employee getEmployeeByid(int id) {
		String query = "select * from Employee where empID="+id+";";
		List<Employee> getEmployee=jdbctemplate.query(query, new EmployeeRowMapper());
		Employee e = new Employee(getEmployee.get(0).getEmpId(),getEmployee.get(0).getEmpName(),getEmployee.get(0).getEmpSal());
		return e;
	}
	

}
