package com.lti.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.LoanApplication;


public interface LoanRepository extends JpaRepository<LoanApplication,Integer> 
{

}
