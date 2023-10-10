package com.greatlearninga.model;

public class Employeea {
	private String fname;
	private String lname;
	private String emailid;
	private String password;
	public Employeea(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public Employeea() {}

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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
