package com.app.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class RegisterChild {
	
	public RegisterChild() {
		super();
	}
	public RegisterChild(String fname, String lname, LocalDate dob, int hid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.hid = hid;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	private String fname;
	private String lname;
	private LocalDate dob;
	private int hid;
	@Override
	public String toString() {
		return "RegisterChild [fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", hid=" + hid + "]";
	}
	
	/*
	"fname" :"sai",
	"lname" :"mogal",
	"dob" :"2003-05-11",
	"hid" : 1
	*/
}
