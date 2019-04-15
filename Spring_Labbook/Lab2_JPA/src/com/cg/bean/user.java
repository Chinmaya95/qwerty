package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_login")
public class user {
@Id
String username;
String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public user(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}

public user() {
	// TODO Auto-generated constructor stub
}


}
