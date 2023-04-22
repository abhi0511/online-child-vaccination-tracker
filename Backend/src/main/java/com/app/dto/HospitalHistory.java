package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class HospitalHistory {
	@Override
	public String toString() {
		return "HospitalHistory [hid=" + hid + ", hname=" + hname + ", regNo=" + regNo + ", oldEmail=" + oldEmail
				+ ", newEmail=" + newEmail + ", oldAddress=" + oldAddress + ", newAddress=" + newAddress
				+ ", oldContact=" + oldContact + ", newContact=" + newContact + "]";
	}
	public HospitalHistory() {
		super();
	}
	public HospitalHistory(int hid, String hname, String regNo, String oldEmail, String newEmail, String oldAddress,
			String newAddress, long oldContact, long newContact) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.regNo = regNo;
		this.oldEmail = oldEmail;
		this.newEmail = newEmail;
		this.oldAddress = oldAddress;
		this.newAddress = newAddress;
		this.oldContact = oldContact;
		this.newContact = newContact;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
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
	private int hid;
	private String hname;
	private String regNo;
	private String oldEmail;
	private String newEmail;
	private String oldAddress;
	private String newAddress;
	private long oldContact;
	private long newContact;
}
