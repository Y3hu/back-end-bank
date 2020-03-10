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

    @GetMapping
    public List<Account> getAllAccountsByUserId(@RequestParam(value = "id", defaultValue = "") int id, @RequestParam(value = "all", defaultValue = "") String all){
        if(all.equals("yes")){
            return accountService.getAllAccounts();
        }else{
            return accountService.getAccountsById(id);
        }
    }

    @PostMapping
    public Account insertAccount(@RequestBody Account account){
        return accountService.insertAccount(account);
    }

    @PutMapping
    public void updateAccount(@RequestBody Account account){
        accountService.updateAccount(account);
    }
}
