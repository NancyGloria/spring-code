package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="usermodel")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String email;
	private String user;
	private String username;
	private String mobilenumber;
	private String userrole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public User() {
		super();
	}
	public User(int id, String email, String user, String username, String mobilenumber, String userrole) {
		super();
		this.id = id;
		this.email = email;
		this.user = user;
		this.username = username;
		this.mobilenumber = mobilenumber;
		this.userrole = userrole;
	}
	
	
	

}
