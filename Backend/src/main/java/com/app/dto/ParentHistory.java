package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ParentHistory {
	public ParentHistory() {
		super();
	}
	public ParentHistory(int pid, String fname, String lname, String oldEmail, String newEmail, String oldAddress,
			String newAddress, long oldContact, long newContact) {
		super();
		this.pid = pid;
		this.fname = fname;
		this.lname = lname;
		this.oldEmail = oldEmail;
		this.newEmail = newEmail;
		this.oldAddress = oldAddress;
		this.newAddress = newAddress;
		this.oldContact = oldContact;
		this.newContact = newContact;
	}
	public int getPid() {
		return pid;
	}
	@Override
	public String toString() {
		return "ParentHistory [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", oldEmail=" + oldEmail
				+ ", newEmail=" + newEmail + ", oldAddress=" + oldAddress + ", newAddress=" + newAddress
				+ ", oldContact=" + oldContact + ", newContact=" + newContact + "]";
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	public String getOldEmail() {
		return oldEmail;
	}
	public void setOldEmail(String oldEmail) {
		this.oldEmail = oldEmail;
	}
	public String getNewEmail() {
		return newEmail;
	}
	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}
	public String getOldAddress() {
		return oldAddress;
	}
	public void setOldAddress(String oldAddress) {
		this.oldAddress = oldAddress;
	}
	public String getNewAddress() {
		return newAddress;
	}
	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}
	public long getOldContact() {
		return oldContact;
	}
	public void setOldContact(long oldContact) {
		this.oldContact = oldContact;
	}
	public long getNewContact() {
		return newContact;
	}
	public void setNewContact(long newContact) {
		this.newContact = newContact;
	}
	private int pid;
	private String fname;
	private String lname;
	private String oldEmail;
	private String newEmail;
	private String oldAddress;
	private String newAddress;
	private long oldContact;
	private long newContact;
	

}
