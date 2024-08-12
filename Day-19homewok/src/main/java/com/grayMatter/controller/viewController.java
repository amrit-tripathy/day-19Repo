package com.grayMatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class viewController {
	@RequestMapping("addpost")
	public ModelAndView showAdd() {
		return new ModelAndView("addPost");
	}
	@RequestMapping("deletepost")
	public ModelAndView showDelete() {
		return new ModelAndView("deletePost");
	}
	@RequestMapping("updatepost")
	public ModelAndView showUpdate() {
		return new ModelAndView("updatePost");
	}
	
}
