package com.grayMatter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Post;
import com.grayMatter.services.PostServices;


@Controller
public class PostController {
	@Autowired
	PostServices service;
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView dologin(@RequestParam String name,@RequestParam String pwd)
	{
		ModelAndView mv = null;
		if(name.equals("admin")&& pwd.equals("99")) {
			mv = new ModelAndView("welcome");
		}
		else {
			mv = new ModelAndView("index");
		}
		return mv;
	}
	@RequestMapping("getallpost")//get
	public ModelAndView showAllPost() {
		return new ModelAndView("getallPost");
	}
	@RequestMapping("getpostbyid")//get
	public ModelAndView showPostById() {
		return new ModelAndView("getallPost");
	}
	@RequestMapping(value="addPost",method=RequestMethod.POST)
	public ModelAndView doadd(@RequestParam String id,@RequestParam String title,@RequestParam String content,@RequestParam String author)
	{
		Post p = new Post(Integer.parseInt(id),title,content,author);
		service.addPost(p);
		
		return new ModelAndView("welcome");
	}
	@RequestMapping(value="deletePost",method=RequestMethod.POST)
	public ModelAndView dodelete(@RequestParam String id)
	{
		service.deletePost(Integer.parseInt(id));
		return new ModelAndView("welcome");
	}
	
}
