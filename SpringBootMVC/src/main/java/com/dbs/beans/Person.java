package com.dbs.beans;

public class Person {
	
	String name;
	String email;
	String mobile;
	
	
	public Person() {
		super();
	}
	public Person(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	

}
