package com.app.pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.type.EnumType;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="child")


@SuppressWarnings("serial")
@Transient
public class Child implements Serializable{
	@Override
	public String toString() {
		return "Child [cid=" + cid + ", cname=" + cname + ", clname=" + clname + ", dob=" + dob + ", status=" + status
				+ ", hospital=" + hospital + ", parent=" + parent + "]";
	}

	public Child() {
		super();
	}

	public Child(int cid, @NotBlank(message = "child name must be provided") String cname,
			@NotBlank(message = "child surname must be privided") String clname,
			@Past(message = "Date of birth should be before current date") LocalDate dob, Status status,
			Hospital hospital, Parent parent) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.clname = clname;
		this.dob = dob;
		this.status = status;
		this.hospital = hospital;
		this.parent = parent;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@NotBlank(message = "child name must be provided")//The annotated element must not be null nor empty.
	//@Length(min=2,max = 15,message = "Invalid name entered")
	@Column
	private String cname;
	//@Length(min=2,max = 15,message = "Invalid Surname entered")
	@NotBlank(message = "child surname must be privided")
	@Column
	private String clname;
	@Column
	@Past(message = "Date of birth should be before current date")
	private LocalDate dob;
	@Column
	@Enumerated(javax.persistence.EnumType.STRING)
	private Status status;
	
	@ManyToOne(optional=false) //many(child) *--->1 (Hospital)  bidirection
	@JoinColumn(name="hid",nullable = false,updatable = false)
	@JsonIgnoreProperties("hChilds")
	@JsonBackReference
	private Hospital hospital;
	
	@ManyToOne(optional=false)//
	@JoinColumn(name="parentid",nullable = false,updatable = false)
	@JsonIgnoreProperties("pChilds")
	@JsonBackReference
	private Parent parent;
	
	public Child(String cname, String clname, LocalDate dob,Status status ,Hospital hospital,Parent parent) {
		super();
		this.cname = cname;
		this.clname = clname;
		this.dob = dob;
		this.hospital = hospital;
		this.parent=parent;
		this.status=status;
		//this.parent=parent;
	}
	
//	@OneToOne //child 1-->1 vaccine
//	private Vaccine_Details vaccine;
	
	
	
}
