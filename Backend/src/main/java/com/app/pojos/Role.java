package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.EnumType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="role_table")
//Below three annotation are taken from lombook 
//@Data  //Generates getters for all fields, a useful toString method, and hashCode and equals
//this is our pojo corresponds to role_table

public class Role {
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", rname=" + rname + ", description=" + description + "]";
	}
	public Role() {
		super();
	}
	public Role(int roleId, String rname, String description) {
		super();
		this.roleId = roleId;
		this.rname = rname;
		this.description = description;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Id
	private int roleId;
	@Column(length=20)
	private String rname;
	@Column(length=45)
	private String description;
	
	
	
}
