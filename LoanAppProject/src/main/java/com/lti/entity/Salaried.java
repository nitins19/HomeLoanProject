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
@Table(name="Salaried_Users105")
public class Salaried 
{
	@Id
	@SequenceGenerator(name="sal_seq",initialValue=6,allocationSize=1)
	@GeneratedValue(generator="sal_seq",strategy=GenerationType.SEQUENCE)
	@Column(name="SRNO")
	private int srNo;
	
	private int retirementAge;
	private int monthlySalary;
	private String organization;
	
	@Autowired
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	

	public Salaried(int srNo, int retirementAge, int monthlySalary, String organization, User user) {
		super();
		this.srNo = srNo;
		this.retirementAge = retirementAge;
		this.monthlySalary = monthlySalary;
		this.organization = organization;
		this.user = user;
	}
	
	

	public Salaried() {
		super();
	}



	public int getSrNo() {
		return srNo;
	}

	public void setSr_No(int srNo) {
		this.srNo = srNo;
	}

	public int getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Salaried [srNo=" + srNo + ", retirementAge=" + retirementAge + ", monthlySalary=" + monthlySalary
				+ ", organization=" + organization + ", user=" + user + "]";
	}
	
	
	

}