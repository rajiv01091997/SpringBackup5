package com.glo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String userName;
private	String description;

@OneToOne(cascade = CascadeType.ALL)
private User user;

public Profile() {
	super();
	// TODO Auto-generated constructor stub
}

public Profile(int id, String userName, String description, User user) {
	super();
	this.id = id;
	this.userName = userName;
	this.description = description;
	this.user = user;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "Profile [id=" + id + ", userName=" + userName + ", description=" + description + ", user=" + user + "]";
}


}
