package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.Property;

public interface PropertyRepository extends JpaRepository<Property,Integer> {

}
