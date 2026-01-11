package com.springboot.s_aopdemo_pointcut_declarations.dao;

import java.util.List;

import com.springboot.s_aopdemo_pointcut_declarations.Account;

public interface AccountDAO {
    List<Account> findAccounts();
    
    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);
}
