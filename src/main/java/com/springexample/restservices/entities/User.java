package com.springexample.restservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue
	private Long Id;
	@Column(name ="USER_NAME",length=50,unique=true,nullable=false)
	private String userName;
	@Column(name="FIRST_NAME",length=50,nullable=false)
	private String firstName;
	@Column(name="LAST_NAME",length=50,nullable=false)
	private String lastName;
	@Column(name="EMAIL",length=50,nullable=false)
	private String email;
	@Column(name="ROLE",length=50,nullable=false)
	private String role;
	
	@Column(name ="SSn",length=50,unique=true,nullable=false)
	private String ssn;

	public User() {
		
	}

	public User(Long id, String userName, String firstName, String lastName, String email, String role, String ssn) {
		Id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}
	
	
	
	
	
}
