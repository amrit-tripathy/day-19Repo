package com.grayMatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grayMatter.dao.PostDao;
import com.grayMatter.dao.PostMapper;
import com.grayMatter.model.Post;

@Service
public class PostServices {
	@Autowired
	private PostDao postdao;
	
	public List<Post> getAllBlog(){	
		return postdao.getAllBlog();
	}
	public Post getPostById(int id) {
		return postdao.getPostById(id);
	}
	public int addPost(Post p) {
		return postdao.addPost(p);
	}
	public int deletePost(int id) {
		return postdao.deletePost(id);
	}
	public int updatePost(Post p) {
		return postdao.updatePost(p);
	} 
	
}
