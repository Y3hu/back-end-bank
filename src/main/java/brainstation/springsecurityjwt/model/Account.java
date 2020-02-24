package brainstation.springsecurityjwt.model;

import brainstation.springsecurityjwt.dto.AccountDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Account {
    private int id;
    private int accountNumber;
    private String currency;
    private User user;
    private List<Movement> movements;

    public Account(){}
    public Account(@JsonProperty("id") int id,
                   @JsonProperty("accountNumber") int accountNumber,
                   @JsonProperty("currency") String currency,
                   @JsonProperty("user") User user,
                   @JsonProperty("movements") List<Movement> movements) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.user = user;
        this.movements = movements;
    }

    public Account(AccountDto accountDto){
        this.id = accountDto.getId();
        this.accountNumber = accountDto.getAccountNumber();
        this.currency = accountDto.getCurrency();
        this.user = new User(accountDto.getUser());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Movement> getMovements() { return movements; }

    public void setMovements(List<Movement> movements) {
        this.movements = movements;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", currency='" + currency + '\'' +
                ", user=" + user +
                ", movements=" + movements +
                '}';
    }
}
