package com.springboot.r_aopdemo.dao;

import org.springframework.stereotype.Repository;

import com.springboot.r_aopdemo.Account;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Override
    public void addAccount(Account theAccount) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

}
