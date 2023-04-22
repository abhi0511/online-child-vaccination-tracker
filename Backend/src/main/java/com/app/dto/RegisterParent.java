package com.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;



public class RegisterParent {
	@Override
	public String toString() {
		return "RegisterParent [fname=" + fname + ", lname=" + lname + ", email=" + email + ", contactNo=" + contactNo
				+ ", address=" + address + ", adharNo=" + adharNo + ", username=" + username + ", password=" + password
				+ "]";
	}
	public RegisterParent() {
		super();
	}
	public RegisterParent(String fname, String lname, String email, long contactNo, String address, long adharNo,
			String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.adharNo = adharNo;
		this.username = username;
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
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
	private String fname;
	private String lname;
	private String email;
	private long contactNo;
	private String address;
	private long adharNo;
	private String username;
	private String password;
	
	/*
	 "fname":"shri",
	    "lname":"shri",
	    "email":"shivam@gmail.com",
	    "contactNo":7841892752,
	    "address":"nanded",
	    "adharNo":803435099394,
	    "username":"shri",
	    "password":"shri"
	   */
	
}
