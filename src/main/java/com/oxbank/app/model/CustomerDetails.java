package com.oxbank.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERDETAILS")
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private long mobileNumber;
	private String dob;
	private String gender;
	private String maritalStaus;
	private float creditScore;
	private double salary;
	private float expense;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStaus() {
		return maritalStaus;
	}
	public void setMaritalStaus(String maritalStaus) {
		this.maritalStaus = maritalStaus;
	}
	public float getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(float creditScore) {
		this.creditScore = creditScore;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public float getExpense() {
		return expense;
	}
	public void setExpense(float expense) {
		this.expense = expense;
	}
	
	
	
	
	
	
	

}
