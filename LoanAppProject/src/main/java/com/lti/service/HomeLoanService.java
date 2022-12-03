package com.lti.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.lti.dto.UserResponse;
import com.lti.entity.Account;
import com.lti.entity.LoanApplication;
import com.lti.entity.Property;
import com.lti.entity.Salaried;
import com.lti.entity.SelfEmployeed;
import com.lti.entity.User;



public interface HomeLoanService
{	
User registerUser(User users);
public UserResponse loginProcess(User user);
public boolean addSalariedDetails(Salaried salaried);
public boolean addSelfEmployeedDetails(SelfEmployeed selfemployed);
public boolean addPropertyDetails(Property property);
public boolean addLoanDetails(LoanApplication application);
public User getUserInfobyId(int userId);
public List<User> getAllUsers();
//@Query(value="Select l from LoanApplication l where applicationId=:idd")
List<LoanApplication> findApplicationById(int userId);
public List<Account>getAccountListbyAppId(int appId);
}