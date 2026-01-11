package com.springboot.s_aopdemo_pointcut_declarations.dao;

import com.springboot.s_aopdemo_pointcut_declarations.Account;

public interface AccountDAO {
    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}
