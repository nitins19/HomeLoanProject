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
@Table(name = "LOAN_SELFEMPLOYEED105")
public class SelfEmployeed {

	@Id
	@SequenceGenerator(name = "srno_seq", initialValue = 6, allocationSize = 1)
	@GeneratedValue(generator = "srno_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "SRNO")
	private int srNo;
	
	private double income;
	private String typeOfWork;
	
	@Autowired
	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	

	public SelfEmployeed() {
		super();
	}

	public SelfEmployeed(int srNo, double income, String typeOfWork, User user) {
		super();
		this.srNo = srNo;
		this.income = income;
		this.typeOfWork = typeOfWork;
		this.user = user;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getTypeOfWork() {
		return typeOfWork;
	}

	public void setTypeOfWork(String typeOfWork) {
		this.typeOfWork = typeOfWork;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SelfEmployeed [srNo=" + srNo + ", income=" + income + ", typeOfWork=" + typeOfWork + ", user=" + user
				+ "]";
	}

	
	

}