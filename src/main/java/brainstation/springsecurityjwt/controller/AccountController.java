package brainstation.springsecurityjwt.controller;

import brainstation.springsecurityjwt.model.Account;
import brainstation.springsecurityjwt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("api/account")
@RestController
public class AccountController {
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(path = "{id}")
    public List<Account> getAllAccountsByUserId(@PathVariable("id") int id){
        return accountService.getAccountsById(id);
    }

    @PostMapping
    public void insertAccount(@RequestBody Account account){
        accountService.insertAccount(account);
    }
}
