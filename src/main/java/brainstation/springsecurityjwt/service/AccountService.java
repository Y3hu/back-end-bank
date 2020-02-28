package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.model.Account;

import java.util.List;

public interface AccountService {
    public Account insertAccount(Account account);
    public List<Account> getAccountsById(int id);
    public List<Account> getAllAccounts();
    public void updateAccount(Account account);
}