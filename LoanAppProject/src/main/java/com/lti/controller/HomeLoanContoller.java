package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.UserResponse;
import com.lti.entity.Account;
import com.lti.entity.LoanApplication;
import com.lti.entity.Property;
import com.lti.entity.Salaried;
import com.lti.entity.SelfEmployeed;
import com.lti.entity.User;
import com.lti.service.HomeLoanService;
@CrossOrigin(origins="*")
@RequestMapping("/homeloanapp")
@RestController
public class HomeLoanContoller 
{
	@Autowired
	public HomeLoanService hservice;
	
	
	//Register the new user applying for application
	@PostMapping("/adduser")
	public User registerUser(@RequestBody User user) {
		 hservice.registerUser(user);
		return user;
	}
	
	@PostMapping("/userlogin")
	public UserResponse userlogin(@RequestBody User user) {
		return hservice.loginProcess(user);
	}
	
	
	//Add the income details of the user who is salaried 
	@PostMapping("/addsalaried")
	public Salaried AddSalariedInfo(@RequestBody Salaried salaried)
	{
		 hservice.addSalariedDetails(salaried);
		 return salaried;
	}
	
	//Add the income details of the user who is self employeed 
	@PostMapping("/addselfemp")
	public SelfEmployeed AddSelfEmpInfo(@RequestBody SelfEmployeed selfemployeed)
	{
		hservice.addSelfEmployeedDetails(selfemployeed);
		return selfemployeed;
	}
	
	//Adding the property details of the user
	@PostMapping("/addpropertydet")
	public Property AddPropertyInfo(@RequestBody Property property) {
	 hservice.addPropertyDetails(property);
	 return property;
	}
	
	@PostMapping("/addloanappdet")
	public LoanApplication addLoanInfo(@RequestBody LoanApplication application) {
		 hservice.addLoanDetails(application);
		 return application;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> ulist=hservice.getAllUsers();
		return ulist;
	}
	

	@GetMapping("/users/{uid}")
	public User getUserbyId(@PathVariable("uid")int userId) {
		User u=hservice.getUserInfobyId(userId);
		return u;
	}
	
	//Loan Application data is displayed using users ID
	@GetMapping(value="/getapplicationby-userId/{userId}")
	public List<LoanApplication> findApplicationByUserId(@PathVariable("userId") int userId) {
		List<LoanApplication> application = hservice.findApplicationById(userId);
	    return application;
	}
	
	@GetMapping(value="/getaccdet/{appId}")
	public List<Account> getaccountdetails(@PathVariable("appId") int appId)
	{
		List<Account> list=hservice.getAccountListbyAppId(appId);
		return list;
	}
	
}
