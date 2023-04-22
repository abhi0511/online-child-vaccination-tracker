package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UpdateInformation {
	
	public UpdateInformation() {
		super();
	}
	public UpdateInformation(String email, String address, long mobile) {
		super();
		this.email = email;
		this.address = address;
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	private String email;
	private String address;
	private long mobile;
	@Override
	public String toString() {
		return "UpdateInformation [email=" + email + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	/*
	"email":"hari123@gmail.com",
	"address" : "Thane",
	"mobile" : 9874563210
	*/
}
