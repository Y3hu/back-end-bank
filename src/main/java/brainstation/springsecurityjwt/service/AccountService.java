package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.model.Account;

import java.util.List;

public interface AccountService {
    public void insertAccount(Account account);
    public List<Account> getAccountsById(int id);
    public void updateAccount(Account account);
}