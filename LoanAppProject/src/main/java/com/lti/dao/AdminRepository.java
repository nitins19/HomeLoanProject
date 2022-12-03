package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.Admin;


public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
