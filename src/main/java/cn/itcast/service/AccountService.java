package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有账户信息
    List<Account> fiandAll();
    //保存账户信息
    void saveAccount(Account account);
}
