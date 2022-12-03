package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.Salaried;

public interface SalariedRepository extends JpaRepository<Salaried,Integer> {

}
