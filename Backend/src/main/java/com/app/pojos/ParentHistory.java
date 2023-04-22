package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name="parenthistory")
public class ParentHistory {
	public ParentHistory() {
		super();
	}
	public ParentHistory(int id, int newpid, String newaddress, String oldaddress, Long newadhar_no, String newemail,
			String oldemail, String newfname, String newlname, Long newcontactno, Long oldcontactno, String action) {
		super();
		this.id = id;
		this.newpid = newpid;
		this.newaddress = newaddress;
		this.oldaddress = oldaddress;
		this.newadhar_no = newadhar_no;
		this.newemail = newemail;
		this.oldemail = oldemail;
		this.newfname = newfname;
		this.newlname = newlname;
		this.newcontactno = newcontactno;
		this.oldcontactno = oldcontactno;
		this.action = action;
	}
	@Override
	public String toString() {
		return "ParentHistory [id=" + id + ", newpid=" + newpid + ", newaddress=" + newaddress + ", oldaddress="
				+ oldaddress + ", newadhar_no=" + newadhar_no + ", newemail=" + newemail + ", oldemail=" + oldemail
				+ ", newfname=" + newfname + ", newlname=" + newlname + ", newcontactno=" + newcontactno
				+ ", oldcontactno=" + oldcontactno + ", action=" + action + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNewpid() {
		return newpid;
	}
	public void setNewpid(int newpid) {
		this.newpid = newpid;
	}
	public String getNewaddress() {
		return newaddress;
	}
	public void setNewaddress(String newaddress) {
		this.newaddress = newaddress;
	}
	public String getOldaddress() {
		return oldaddress;
	}
	public void setOldaddress(String oldaddress) {
		this.oldaddress = oldaddress;
	}
	public Long getNewadhar_no() {
		return newadhar_no;
	}
	public void setNewadhar_no(Long newadhar_no) {
		this.newadhar_no = newadhar_no;
	}
	public String getNewemail() {
		return newemail;
	}
	public void setNewemail(String newemail) {
		this.newemail = newemail;
	}
	public String getOldemail() {
		return oldemail;
	}
	public void setOldemail(String oldemail) {
		this.oldemail = oldemail;
	}
	public String getNewfname() {
		return newfname;
	}
	public void setNewfname(String newfname) {
		this.newfname = newfname;
	}
	public String getNewlname() {
		return newlname;
	}
	public void setNewlname(String newlname) {
		this.newlname = newlname;
	}
	public Long getNewcontactno() {
		return newcontactno;
	}
	public void setNewcontactno(Long newcontactno) {
		this.newcontactno = newcontactno;
	}
	public Long getOldcontactno() {
		return oldcontactno;
	}
	public void setOldcontactno(Long oldcontactno) {
		this.oldcontactno = oldcontactno;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int newpid;
	@Column
	private String newaddress;
	@Column
	private String oldaddress;
	@Column
	private Long newadhar_no ;
	@Column
	private String newemail;
	@Column
	private String oldemail ;
	@Column
	private String newfname ;
	@Column
	private String newlname ;
	@Column
	private Long newcontactno ;
	@Column
	private Long oldcontactno;
	@Column
	private String action;

}
