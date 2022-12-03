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
@Table(name="Property_Table105")
public class Property
{
	@Id
	@SequenceGenerator(name = "propid_seq", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "propid_seq", strategy = GenerationType.SEQUENCE)
	@Column(name="PROPERTYID")
	private int propertyId;
	private String propertyName;
	private String propertyLocation;
	private double amount;
	
	@Autowired
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public Property(int propertyId, String propertyName, String propertyLocation, double amount, User user) {
		super();
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.propertyLocation = propertyLocation;
		this.amount = amount;
		this.user = user;
	}

	public Property() {
		super();
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
}
