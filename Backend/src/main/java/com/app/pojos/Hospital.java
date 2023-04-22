package com.app.pojos;

import java.io.Serializable;
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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="hospital")
@SuppressWarnings("serial")
public class Hospital implements Serializable{
	
	public Hospital() {
		super();
	}
	public Hospital(int hid, String hname, String email, long contactNo, String address, Login loginId, 
			String regNo, LocalDate creationDate, 
			int pincode, List<Child> hChilds, List<Vaccine_Details> vaccines) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.loginId = loginId;
		this.regNo = regNo;
		this.creationDate = creationDate;
		this.pincode = pincode;
		this.hChilds = hChilds;
		this.vaccines = vaccines;
	}
	@Override
	public String toString() {
		return "Hospital [hid=" + hid + ", hname=" + hname + ", email=" + email + ", contactNo=" + contactNo
				+ ", address=" + address + ", loginId=" + loginId + ", regNo=" + regNo + ", creationDate="
				+ creationDate + ", pincode=" + pincode + ", hChilds=" + hChilds + ", vaccines=" + vaccines + "]";
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
	public Login getLoginId() {
		return loginId;
	}
	public void setLoginId(Login loginId) {
		this.loginId = loginId;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public List<Child> gethChilds() {
		return hChilds;
	}
	public void sethChilds(List<Child> hChilds) {
		this.hChilds = hChilds;
	}
	public List<Vaccine_Details> getVaccines() {
		return vaccines;
	}
	public void setVaccines(List<Vaccine_Details> vaccines) {
		this.vaccines = vaccines;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;
	//@NotBlank(message = "Hospital name must be provided")
//	@Length(min=8,max = 30,message = "Invalid Hospital name entered")
	@Column //(length=45)
	private String hname;
	//@NotBlank(message = "email must provide")
	//@Length(min=6)
	@Column //(length=30)
	private String email;
	//@Size(min = 10, max = 10)
	@Column
	private long contactNo;
	//@NotBlank(message = "Address should not be empty")
	//@Length(max=50)
	@Column//(length=50)
	private String address;
	@OneToOne
	@JoinColumn(name = "loginid")
	@JsonIgnore
	private Login loginId;
	//@NotEmpty(message="Registration number must enter")
	@Column
	private String regNo;
	@CreationTimestamp
	private LocalDate creationDate;
	//@Length(min=6,max=6)
	@Column//(name="pincode")
	private int pincode;

//	@OneToMany(mappedBy = "hospital" ,fetch=FetchType.EAGER )   //hospital 1-->* Child
//	private List<Child> hChilds=new ArrayList<>();
	
	
	@OneToMany(mappedBy = "hospital"  , fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonIgnoreProperties("hospital")
	@Fetch(value = FetchMode.SUBSELECT)
	@JsonManagedReference
	private List<Child> hChilds=new ArrayList<>();
	

	
	

	@OneToMany  (fetch=FetchType.EAGER) //hospital 1-->* Child
	@Fetch(value = FetchMode.SUBSELECT)
	@JsonIgnore
	//@LazyCollection(LazyCollectionOption.FALSE)
	private List<Vaccine_Details> vaccines=new ArrayList<>();
	
	
	//as per gavin king suggestins add helper methods in collections relation
	public void addChild(Child child) {
		hChilds.add(child);
	}
	public void removeChild(Child child) {
		hChilds.remove(child);
	}
	
	public void addVaccine(Vaccine_Details vaccine) {
		vaccines.add(vaccine);
	}
	public void removeVaccine(Vaccine_Details vaccine) {
		vaccines.remove(vaccine);
	}
	
	public Hospital(String hname, String email, long contactNo, String address, String regNo,Login loginId,int pincode) {
		
		this.hname = hname;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.loginId = loginId;
		this.regNo = regNo;
		this.pincode=pincode;
	}
	
	
		
}
