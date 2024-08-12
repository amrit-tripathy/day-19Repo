package com.grayMatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class viewController {
	@RequestMapping(value="/addEmployee", method=RequestMethod.GET)
	public ModelAndView displayAdd() {
		return new ModelAndView("addEmployee");
	}
	@RequestMapping(value="/getAllEmployees", method=RequestMethod.GET)
	public ModelAndView displayAllEmployees() {
		return new ModelAndView("getAllEmployees");
	}
	@RequestMapping(value="/updateEmployee", method=RequestMethod.GET)
	public ModelAndView displayUpdateEmployee() {
		return new ModelAndView("updateEmployee");
	}
	@RequestMapping(value="/deleteEmployee", method=RequestMethod.GET)
	public ModelAndView displayDeleteEmployee() {
		return new ModelAndView("deleteEmployee");
	}
	@RequestMapping(value="/getEmployeeByid", method=RequestMethod.GET)
	public ModelAndView displaySpecificEmployee() {
		return new ModelAndView("getEmployeeByid");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin() {
        return new ModelAndView("loginpage"); 
    }
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView displaylogin(@RequestParam String names,@RequestParam String ids) {
		System.out.println(names+" "+ids);
		ModelAndView mv =null;
		if(names.equals("admin") && ids.equals("99")) {
			System.out.println("welcome");
			mv= new ModelAndView("welcome");
		}
		else {
			mv = new ModelAndView("index");
		}
		return mv;
	}
	
}
