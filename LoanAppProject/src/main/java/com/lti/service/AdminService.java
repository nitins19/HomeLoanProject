package com.lti.service;

import java.util.List;

import com.lti.entity.Account;
import com.lti.entity.Admin;
import com.lti.entity.LoanApplication;
public interface AdminService 
{
	public Admin createAdmin(Admin admin);
	public boolean adminLogin(Admin admin);
	public List<LoanApplication> viewPendingApprovals();
	List<LoanApplication> getAllApplications();
	List<LoanApplication> approvedApplications();
	List<LoanApplication> rejectedApplications();
	boolean updatestatus(int applicationId, String status);
	public Account createAccount(Account account);
	public int getLoanAmountByAppId(int application_id);
}
