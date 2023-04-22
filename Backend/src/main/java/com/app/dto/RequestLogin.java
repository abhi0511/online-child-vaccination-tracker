package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class RequestLogin {
	public RequestLogin() {
		super();
	}
	public RequestLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
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
	private String username;
	private String password;
	@Override
	public String toString() {
		return "RequestLogin [username=" + username + ", password=" + password + "]";
	}
	
	/*
	"username":"shri",
	"password":"shri"
	*/
}
