package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="User_Table105")
public class User 
{
	@Id
	@SequenceGenerator(name="usr_id",initialValue=1,allocationSize=1)
	@GeneratedValue(generator="usr_id",strategy=GenerationType.SEQUENCE)
	@Column(name="USER_ID")
	private int userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String password;
	private String phoneno;
	private String dob;
	private String gender;
	private String nationality;
	private long aadhar;
	private String pan;
	
	
	
	public User() {
		super();
	}
	public User(int userId, String firstName, String middleName, String lastName, String emailId, String password,
			String phoneno, String dob, String gender, String nationality, long aadhar, String pan) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.phoneno = phoneno;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.aadhar = aadhar;
		this.pan = pan;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", password=" + password + ", phoneno=" + phoneno + ", dob=" + dob
				+ ", gender=" + gender + ", nationality=" + nationality + ", aadhar=" + aadhar + ", pan=" + pan + "]";
	}
	
	
	
}
	