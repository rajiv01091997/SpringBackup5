package com.glo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)//fetch type eager otherwise while fetching give error
	private List<Post> posts;

	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(int id, String name, List<Post> posts) {
		super();
		this.id = id;
		this.fullName = name;
		this.posts = posts;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return fullName;
	}



	public void setName(String name) {
		this.fullName = name;
	}



	public List<Post> getPosts() {
		return posts;
	}



	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + fullName + ", posts=" + posts + "]";
	}
	
	
	

}
