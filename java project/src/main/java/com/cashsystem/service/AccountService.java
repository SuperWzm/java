package com.cashsystem.service;

import com.cashsystem.dao.AccountDao;
import com.cashsystem.enity.Account;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 16:28
 **/
public class AccountService {

    private AccountDao accountDao;

    public AccountService(){
        this.accountDao = new AccountDao();
    }

    public Account login(String username, String password){
        return this.accountDao.login(username,password);
    }

    public boolean register(Account account){
        return this.accountDao.register(account);
    }
}    
    