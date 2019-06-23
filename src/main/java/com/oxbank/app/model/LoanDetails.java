package com.oxbank.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOANDETAILS")
public class LoanDetails {
	
	@Id
	private int mangaerId;
	private long loanAccountNumber;
	private String loanStatus;
	private float loanAmount;
	
	
	public int getMangaerId() {
		return mangaerId;
	}
	public void setMangaerId(int mangaerId) {
		this.mangaerId = mangaerId;
	}
	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	
	
	
	

}
