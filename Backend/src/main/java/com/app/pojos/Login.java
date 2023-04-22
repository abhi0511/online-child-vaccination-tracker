package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="login")
public class Login {
	
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", username=" + username + ", password=" + password + ", role=" + role
				+ "]";
	}


	public Login() {
		super();
	}


	public Login(int loginId, @NotEmpty(message = "Invalid username") String username,
			@NotEmpty(message = "Invalid password") String password, Role role) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public int getLoginId() {
		return loginId;
	}


	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int loginId;
	@NotEmpty(message = "Invalid username")
	
	@Column
	private String username;
	@NotEmpty(message = "Invalid password")
	
	@Column
	private String password;
	
	@OneToOne
	@JoinColumn(name="roleId",nullable=false)
	//@MapsId  //mapping for an EmbeddedId primary key
	private Role role;


	public Login(String username, String password, Role role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	

}
