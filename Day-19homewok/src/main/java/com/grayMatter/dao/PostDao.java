package com.grayMatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.grayMatter.model.Post;

import lombok.Setter;

@Setter
@Component
public class PostDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<Post> getAllBlog(){
		String query="select * from post";
		List<Post> postList =jdbctemplate.query(query, new PostMapper());
		return postList;
	}
	public Post getPostById(int id) {
		String query="select * from post where postId="+id+";";
		List<Post> getPost =jdbctemplate.query(query, new PostMapper());
		return new Post(getPost.get(0).getId(),getPost.get(0).getTitle(),getPost.get(0).getContent(),getPost.get(0).getAuthor());
	}
	public int addPost(Post p) {
		String query="insert into post values("+p.getId()+",'"+p.getTitle()+"','"+p.getContent()+"','"+p.getAuthor()+"');";
		return jdbctemplate.update(query);
	}
	public int deletePost(int id) {
		String query="delete from post where postId="+id+";";
		return jdbctemplate.update(query);
	}
	public int updatePost(Post p) {
		
		String query = "update post SET postTitle = '" + p.getTitle() + "', postContent = '" + p.getContent() + "', postAuthor = '" + p.getAuthor() + "' WHERE postId = " + p.getId();
		return jdbctemplate.update(query);
	}
}
