package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="parent")

public class Parent {
	
	@Override
	public String toString() {
		return "Parent [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile="
				+ mobile + ", address=" + address + ", adharNo=" + adharNo + ", loginDetails=" + loginDetails
				+ ", pChilds=" + pChilds + ", creationDate=" + creationDate + "]";
	}
	public Parent() {
		super();
	}
	public Parent(int pid, @NotEmpty(message = "Invalid first name") @Length(min = 2) String fname,
			@NotEmpty(message = "Invalid last name") @Length(min = 4) String lname, String email, long mobile,
			@NotEmpty(message = "Invalid Address") @Length(min = 5) String address, long adharNo, Login loginDetails,
			List<Child> pChilds, LocalDate creationDate) {
		super();
		this.pid = pid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.adharNo = adharNo;
		this.loginDetails = loginDetails;
		this.pChilds = pChilds;
		this.creationDate = creationDate;
	}
	public int getPid() {
		return pid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
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
	public Login getLoginDetails() {
		return loginDetails;
	}
	public void setLoginDetails(Login loginDetails) {
		this.loginDetails = loginDetails;
	}
	public List<Child> getpChilds() {
		return pChilds;
	}
	public void setpChilds(List<Child> pChilds) {
		this.pChilds = pChilds;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column(name="firstName",length=45)
	@NotEmpty(message = "Invalid first name")
	@Length(min=2)
	private String fname;
	@NotEmpty(message = "Invalid last name")
	@Length(min=4)
	@Column(name="lastName",length=45)
	private String lname;
	@Column(length=25)
	private String email;
	@Column(name="mobileNo")
	private long mobile;
	@NotEmpty(message = "Invalid Address")
	@Length(min=5)
	@Column
	private String address;
	//@Length(min=12,max=12)
	@Column
	private long adharNo;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "loginid")
	//@JsonProperty(access = Access.WRITE_ONLY)
	@JsonIgnore
	private Login loginDetails;
	
	
	@OneToMany(mappedBy = "parent" , fetch = FetchType.EAGER ,cascade = CascadeType.ALL) //MAPPED BY AT OWING SIDE	
	@JsonIgnoreProperties("parent")
	//@Fetch(value = FetchMode.SUBSELECT)
	@JsonManagedReference
	private List<Child> pChilds=new ArrayList<>();


	
	@CreationTimestamp
	private LocalDate creationDate;
	
	
	//as per gavin king suggestins add helper methods in collections relation
	public void addChild(Child child) {
		pChilds.add(child);
	}
	public void removeChild(Child child) {
		pChilds.remove(child);
	}
	public Parent(String fname, String lname, String email, long mobile, String address, long adharNo,Login login) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.adharNo = adharNo;
		this.loginDetails=login;
	}
	public Parent(String email, long mobile, String address) {
		super();
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	
	
		
}
