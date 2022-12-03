package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.SelfEmployeed;
@Repository
public interface SelfEmployeedRepository extends JpaRepository<SelfEmployeed,Integer> {

}