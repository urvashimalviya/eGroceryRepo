package com.thinking.machines.egrocery.hibernate;
// Generated 16 Jan, 2018 9:36:23 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Registration generated by hbm2java
 */
public class Registration implements java.io.Serializable {

	private int customerCode;
	private String username;
	private String password;
	private Date dateOfRegistration;
	private char isActive;

	public Registration() {
	}

	public Registration(int customerCode, String username, String password, Date dateOfRegistration, char isActive) {
		this.customerCode = customerCode;
		this.username = username;
		this.password = password;
		this.dateOfRegistration = dateOfRegistration;
		this.isActive = isActive;
	}

	public int getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfRegistration() {
		return this.dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public char getIsActive() {
		return this.isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

}
