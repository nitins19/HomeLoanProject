package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Account_Holders105")
public class Account {
	@Id
	@Column(name="ACCNO")
	private int accno;
	
	private int approvedamount;
	@Autowired
	@OneToOne
	@JoinColumn(name="APPLICATIONID")
	private LoanApplication loanapp;
	
	
	public Account() {
		super();
	}


	public Account(int accno, int approvedamount, LoanApplication loanapp) {
		super();
		this.accno = accno;
		this.approvedamount = approvedamount;
		this.loanapp = loanapp;
	}


	public int getAccno() {
		return accno;
	}


	public void setAccno(int accno) {
		this.accno = accno;
	}


	public int getApprovedamount() {
		return approvedamount;
	}


	public void setApprovedamount(int approvedamount) {
		this.approvedamount = approvedamount;
	}


	public LoanApplication getLoanapp() {
		return loanapp;
	}


	public void setLoanapp(LoanApplication loanapp) {
		this.loanapp = loanapp;
	}


	@Override
	public String toString() {
		return "Account [accno=" + accno + ", approvedamount=" + approvedamount + ", loanapp=" + loanapp + "]";
	}


	
}
