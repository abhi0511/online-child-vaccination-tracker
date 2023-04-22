package com.app.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="vaccine")

@SuppressWarnings("serial")
public class Vaccine_Details implements Serializable{
	@Override
	public String toString() {
		return "Vaccine_Details [vid=" + vid + ", vname=" + vname + ", description=" + description + ", brand=" + brand
				+ ", type=" + type + ", price=" + price + "]";
	}

	public Vaccine_Details() {
		super();
	}

	public Vaccine_Details(int vid, @NotEmpty(message = "Invalid vaccine name ") String vname,
			@NotEmpty(message = "Invalid description ") String description,
			@NotEmpty(message = "Invalid brand name ") @Length(max = 45) String brand, String type, double price) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.description = description;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Id
	@GeneratedValue
	private int vid;
	@NotEmpty(message = "Invalid vaccine name ")
	//@Length(max=45)
	@Column(length=45)
	private String vname;
	@NotEmpty(message = "Invalid description ")
	//@Length(max=200)
	@Column(length=200)
	private String description;
	@NotEmpty(message = "Invalid brand name ")
	@Length(max=45)
	@Column(length=45)
	private String brand;
	@Column(length=45)
	private String type;
	@Column
	private double price;
	
//	@ManyToOne
//	@JoinColumn(name="hid",nullable = false,updatable = false)
//	private Hospital hospital;
//	
	
	public Vaccine_Details(String vname,String description,String brand, String type, double price) {		 
		super();
		this.vname = vname;
		this.description = description;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
		

}
