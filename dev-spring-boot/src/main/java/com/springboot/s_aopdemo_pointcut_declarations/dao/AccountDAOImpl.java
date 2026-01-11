package com.springboot.s_aopdemo_pointcut_declarations.dao;

import org.springframework.stereotype.Repository;

import com.springboot.s_aopdemo_pointcut_declarations.Account;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Override
    public void addAccount(Account theAccount, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");

        return false;
    }

}
