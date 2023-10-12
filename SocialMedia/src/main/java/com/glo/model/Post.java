package com.glo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	private String content;
	
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Post(int postId, String content) {
		super();
		this.postId = postId;
		this.content = content;
	}


	public int getPostId() {
		return postId;
	}


	public void setPostId(int postId) {
		this.postId = postId;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "Post [postId=" + postId + ", content=" + content + "]";
	}
	
	
	

}
