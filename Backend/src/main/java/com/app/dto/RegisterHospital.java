package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class RegisterHospital {
	private String hname;	
	private String email;
	private long contactNo;
	public RegisterHospital() {
		super();
	}
	public RegisterHospital(String hname, String email, long contactNo, String address, String regNo, String username,
			String password, int pincode) {
		super();
		this.hname = hname;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.regNo = regNo;
		this.username = username;
		this.password = password;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "RegisterHospital [hname=" + hname + ", email=" + email + ", contactNo=" + contactNo + ", address="
				+ address + ", regNo=" + regNo + ", username=" + username + ", password=" + password + ", pincode="
				+ pincode + "]";
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
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
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	private String address;
	private String regNo;
	private String username;
	private String password;
	private int pincode;
	/*
	 "hname" :"ashwini hospital",
	 "email" :"aswini@gmail.com",
	 "contactNo":"5635242800",
	 "address":"shivaji nagar,nanded",
	 "regNo":"9f652h242s",
	 "pincode":431700,
	 "username":"ashwini",
	 "password":"ashwini"
	 */
	
}
