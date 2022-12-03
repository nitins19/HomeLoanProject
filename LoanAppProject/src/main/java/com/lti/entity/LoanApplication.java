package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="LoanApplications_Table105")
public class LoanApplication
{
	@Id
	@SequenceGenerator(name = "appid_seq", initialValue = 1001, allocationSize = 1)
	@GeneratedValue(generator = "appid_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="APPLICATIONID")
	private int applicationId;
	
	private double loanAmount;
	private int tenure;
	private int interest;
	private String status;
	
	@Autowired
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public LoanApplication(int applicationId, double loanAmount, int tenure, int interest, String status, User user) {
		super();
		this.applicationId = applicationId;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.interest = interest;
		this.status = status;
		this.user = user;
	}

	public LoanApplication() {
		super();
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationId=" + applicationId + ", loanAmount=" + loanAmount + ", tenure=" + tenure
				+ ", interest=" + interest + ", status=" + status + ", user=" + user + "]";
	}
	
	

}
