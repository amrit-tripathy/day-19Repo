package com.grayMatter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Employee;
import com.grayMatter.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/getallemployee")
	public ModelAndView getAllEmployees(){
		List<Employee>emplist = service.getAllEmployees();
		System.out.println(emplist);
		ModelAndView mv=new ModelAndView("getAllEmployees");
		mv.addObject("emplist",emplist);
		return mv;
	}
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public ModelAndView doadd(@RequestParam String empId,@RequestParam String empName,@RequestParam String empSal) {
		service.addEmployee(new Employee(Integer.parseInt(empId),empName,Double.parseDouble(empSal)));
		return new ModelAndView("Home");
	}
	@RequestMapping(value="/deleteEmployee", method=RequestMethod.POST)
	public ModelAndView dodelete(@RequestParam String empId) {
		service.deleteEmployee(Integer.parseInt(empId));
		return new ModelAndView("Home");
	}
	@RequestMapping(value="/updateEmployee", method=RequestMethod.POST)
	public ModelAndView doupdate(@RequestParam String empId,@RequestParam String empSal) {
		service.updateEmployee(Integer.parseInt(empId),Integer.parseInt(empSal));
		return new ModelAndView("Home");
	}
	@RequestMapping(value="/getEmployeeByid", method=RequestMethod.POST)
	public ModelAndView dogetid(@RequestParam String empId) {
		Employee e=service.getEmployeeByid(Integer.parseInt(empId));
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("employee",e);
		return mv;
	}
	
	
	
}
