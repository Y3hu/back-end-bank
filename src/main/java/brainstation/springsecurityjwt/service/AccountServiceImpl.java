package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.dao.AccountDao;
import brainstation.springsecurityjwt.dto.AccountDto;
import brainstation.springsecurityjwt.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;

    @Autowired
    public AccountServiceImpl(@Qualifier("AccountDao") AccountDao accountDao) {
        this.accountDao = accountDao;
    }

//    @Transactional
//    @Override
//    public Account findAccountById(int id) {
//        Optional<AccountDto> accountFound = accountDao.findById(id);
//        if(accountFound.isPresent()){
//            Account account = new Account();
//            account.setId(accountFound.get().getId());
//            account.setAccountNumber(accountFound.get().getAccountNumber());
//            account.setCurrency(accountFound.get().getCurrency());
//            account.setUser(new User(accountFound.get().getUser()));
//            account.setMovements(accountFound.get().getMovements().stream().map(Movement::new).collect(Collectors.toList()));
//            return account;
//        }
//        return null;
//    }

    @Transactional
    @Override
    public void insertAccount(Account account) {
        if(account.getUser().getAccounts() == null) account.getUser().setAccounts(new ArrayList<>());

        if(account.getUser().getMessages() == null) account.getUser().setMessages(new ArrayList<>());

        AccountDto accountDto = new AccountDto(account);

        if(accountDto.getMovements() == null) accountDto.setMovements(new ArrayList<>());
        accountDao.save(accountDto);
    }

    @Override
    public List<Account> getAccountsById(int id) {
        List<AccountDto> accountList = accountDao.findAll();
        List<Account> userAccounts = new ArrayList<>();
        for(AccountDto a: accountList){
            if(a.getUser().getId() == id){
                Account account = new Account(a);
                userAccounts.add(account);
            }
        }
        return userAccounts;
    }

    @Override
    public void updateAccount(Account account) {
        insertAccount(account);
    }
}
