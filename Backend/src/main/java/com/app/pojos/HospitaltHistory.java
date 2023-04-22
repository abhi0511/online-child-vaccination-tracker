package com.app.pojos;

import java.time.LocalDate;

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
@Table(name="hospitalhistory")
public class HospitaltHistory {
	@Override
	public String toString() {
		return "HospitaltHistory [id=" + id + ", newhid=" + newhid + ", newaddress=" + newaddress + ", oldaddress="
				+ oldaddress + ", newcontactno=" + newcontactno + ", oldcontactno=" + oldcontactno + ", creation_date="
				+ creation_date + ", newemail=" + newemail + ", oldemail=" + oldemail + ", newhname=" + newhname
				+ ", newpincode=" + newpincode + ", newreg_no=" + newreg_no + ", action=" + action + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNewhid() {
		return newhid;
	}
	public void setNewhid(int newhid) {
		this.newhid = newhid;
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
	public LocalDate getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(LocalDate creation_date) {
		this.creation_date = creation_date;
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
	public String getNewhname() {
		return newhname;
	}
	public void setNewhname(String newhname) {
		this.newhname = newhname;
	}
	public Long getNewpincode() {
		return newpincode;
	}
	public void setNewpincode(Long newpincode) {
		this.newpincode = newpincode;
	}
	public String getNewreg_no() {
		return newreg_no;
	}
	public void setNewreg_no(String newreg_no) {
		this.newreg_no = newreg_no;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public HospitaltHistory() {
		super();
	}
	public HospitaltHistory(int id, int newhid, String newaddress, String oldaddress, Long newcontactno,
			Long oldcontactno, LocalDate creation_date, String newemail, String oldemail, String newhname,
			Long newpincode, String newreg_no, String action) {
		super();
		this.id = id;
		this.newhid = newhid;
		this.newaddress = newaddress;
		this.oldaddress = oldaddress;
		this.newcontactno = newcontactno;
		this.oldcontactno = oldcontactno;
		this.creation_date = creation_date;
		this.newemail = newemail;
		this.oldemail = oldemail;
		this.newhname = newhname;
		this.newpincode = newpincode;
		this.newreg_no = newreg_no;
		this.action = action;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int newhid ;
	@Column
	private String newaddress ;
	@Column
	private String oldaddress;
	@Column
	private Long newcontactno ;
	@Column
	private Long oldcontactno ;
	@Column
	private LocalDate creation_date ;
	@Column
	private String newemail;
	@Column
	private String oldemail;
	@Column
	private String newhname;
	@Column
	private Long newpincode ;
	@Column
	private String newreg_no ;
	@Column
	private String action;
/*
 newhid int,
newaddress varchar(40),
oldaddress varchar(50),
newcontactno bigint,
oldcontactno bigint,
creation_date Date,
newemail varchar(40),
oldemail varchar(40),
newhname varchar(40),
newpincode bigint,
newreg_no varchar(40),
action varchar(15)
 */
}

