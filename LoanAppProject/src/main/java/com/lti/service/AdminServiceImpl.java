package com.lti.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.AccountRepository;
import com.lti.dao.AdminRepository;
import com.lti.dao.LoanRepository;
import com.lti.entity.Account;
import com.lti.entity.Admin;
import com.lti.entity.LoanApplication;
import com.lti.exception.AppExcep;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private LoanRepository loanrep;
	
	@Autowired
	private AccountRepository accrep;
	
	@Autowired
	private AdminRepository adminrep;
	
	@PersistenceContext
	EntityManager em;
	
	
	@Transactional
	@Override
	public Admin createAdmin(Admin admin)
	{
		adminrep.save(admin);
		return admin;
	}
	@Transactional
	@Override
	public boolean adminLogin(Admin admin) 
	{
     boolean check=false;
     Admin a1 = null;
		 try {
			 String username =  admin.getUserName();
			 String password = admin.getPassword();
			 a1 = (Admin)em.createQuery("select a from Admin a where a.userName=:userName").setParameter("userName", username).getSingleResult();
				
			 if( (a1.getUserName().equals(username)) && (a1.getPassword().equals(password)) )
			 {		
					check=true;
			 }
			else 
			{
					check=false;
			}
			
		    }
		    catch(Exception e) { 
		    	System.out.println(e);	 
			}
		return check;
	}
	
	@Transactional
	@Override
	public List<LoanApplication> viewPendingApprovals()
	{
		Query qry = em.createQuery("Select la from LoanApplication la where status=:prm");
		qry.setParameter("prm", "pending");
		List<LoanApplication> applist=qry.getResultList();
		return applist;
	}
	
	@Transactional
	@Override
	public List<LoanApplication> getAllApplications() 
	{
		List<LoanApplication>l1=loanrep.findAll();
		return l1;
	}
	
	@Transactional
	@Override
	public List<LoanApplication> approvedApplications() 
	{
		Query q1 = em.createQuery("Select la from LoanApplication la where status=:prm");
		q1.setParameter("prm", "Approved");
		List<LoanApplication> applist=q1.getResultList();
		return applist;
	}
	
	@Transactional
	@Override
	public List<LoanApplication> rejectedApplications() 
	{
		Query q2 = em.createQuery("Select la from LoanApplication la where status=:prm");
		q2.setParameter("prm", "Rejected");
		List<LoanApplication> applist=q2.getResultList();
		return applist;
	}

	@Transactional
	@Override
	public boolean updatestatus(int applicationId, String status) {
		
		LoanApplication la=em.find(LoanApplication.class,applicationId);
		la.setStatus(status);
		LoanApplication update_app=em.merge(la);
		System.out.println("merged successfully");
		return true;
	}
	
	@Transactional
	@Override
	public Account createAccount(Account account)
	{
		accrep.save(account);
		return account;
	}
	
	
	@Transactional
	@Override
	public int getLoanAmountByAppId(int application_id) {
		Query q1=em.createQuery("Select la from LoanApplication la where applicationId=:appid");
		q1.setParameter("appid",application_id);
		List<LoanApplication> la1=q1.getResultList();
		int result=0;
		for(int i=0;i<la1.size();i++)
		{
			result=(int)(la1.get(i).getLoanAmount());
		}
		
		return (int)result;
		
	}


}
