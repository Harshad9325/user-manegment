package com.xadmin.usermanagement.model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */

public class User {
	protected int id;
	protected String name;
	protected String email;
	protected String country;
	protected String mobileNo;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User( String name, String email, String country, String mobileNo) {
		super();
		
		this.name = name;
		this.email = email;
		this.country = country;
		this.mobileNo = mobileNo;
	}
	
	
	
	public User(int id, String name, String email, String country, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
		this.mobileNo = mobileNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getmobileNo() {
		return mobileNo;
	}
	public void setmobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", country=" + country + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
}