package com.lti.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}

