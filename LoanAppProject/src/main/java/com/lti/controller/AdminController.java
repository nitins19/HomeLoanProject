package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Account;
import com.lti.entity.Admin;
import com.lti.entity.LoanApplication;
import com.lti.entity.User;
import com.lti.exception.AppExcep;
import com.lti.service.AdminService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminservice;
	
	//Adding admin to update the status of the loans
	@PostMapping(value="/addadmin")
	public Admin addAdmin(@RequestBody Admin admin)
	{
		adminservice.createAdmin(admin);
		return admin;
	}
	
	//Admin logins
	@PostMapping(value="/adminlogin")
	public boolean adminlogin(@RequestBody Admin admin) 
	{
		boolean verify=adminservice.adminLogin(admin);
		return verify;
	}
	
	//Pending loans are displayed on admin dashboard
	@GetMapping(value="/pendingapplns")
	public List<LoanApplication> getPendingList(){
		List<LoanApplication> list=adminservice.viewPendingApprovals();
		return list;
	}
	
	//Approved loans are displayed on admin dashboard
	@GetMapping(value="/approvedapplns")
	public List<LoanApplication> getApprovedList(){
		List<LoanApplication> list=adminservice.approvedApplications();
		return list;
		
	}
	
	//Rejected loans are displayed on admin dashboard
	@GetMapping(value="/rejectedapplns")
	public List<LoanApplication> getRejectedList(){
		List<LoanApplication> list=adminservice.rejectedApplications();
		return list;
		
	}
	
	//All loan Applications are displayed on admin dashboard
	@GetMapping(value="/allapplns")
	public List<LoanApplication> getApplnList(){
		List<LoanApplication> list=adminservice.getAllApplications();
		return list;
	}
	
	//Loan Application status is updated using id
	@PutMapping("/updatestatus/{application_id}/{status}")
	public boolean update_Userstatus(@PathVariable("application_id") int applicationId, @PathVariable("status") String status) 
	{
		boolean response = adminservice.updatestatus(applicationId, status);
		return response;
	}
	
	@PostMapping("/add-account")
	public Account generateAccount(@RequestBody Account account)
	{
		adminservice.createAccount(account);
		return account;
	}
	
	
	
}
