package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ChangePassword 
{
	public ChangePassword()
	{
		super();
	}
	
	public ChangePassword(String username, String newPassword, String cnfPassword) {
		super();
		this.username = username;
		this.newPassword = newPassword;
		this.cnfPassword = cnfPassword;
	}
	@Override
	public String toString() {
		return "ChangePassword [username=" + username + ", newPassword=" + newPassword + ", cnfPassword=" + cnfPassword
				+ "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getCnfPassword() {
		return cnfPassword;
	}
	public void setCnfPassword(String cnfPassword) {
		this.cnfPassword = cnfPassword;
	}
	private String username;
	private String newPassword;
	private String cnfPassword;
	
	
	/*
	 "username" : "shri",
	 " newPassword" :"shri",
	 "cnfPassword" : "shri123"
	 
	 */

}
