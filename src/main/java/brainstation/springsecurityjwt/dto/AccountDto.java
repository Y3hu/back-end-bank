package brainstation.springsecurityjwt.dto;

import brainstation.springsecurityjwt.model.Account;

import javax.persistence.*;
import java.util.List;

@Entity(name = "account")
public class AccountDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int accountNumber;
    private String currency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private UserDto userDto;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "accountDto")
    private List<MovementDto> movements;

    public AccountDto(){}

    public AccountDto(int id, int accountNumber, String currency, UserDto userDto, List<MovementDto> movements) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.userDto = userDto;
        this.movements = movements;
    }

    public AccountDto(Account account){
        this.id = account.getId();
        this.accountNumber = account.getAccountNumber();
        this.currency = account.getCurrency();
        this.userDto = new UserDto(account.getUser());
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

    public UserDto getUser() { return userDto; }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public List<MovementDto> getMovements() { return movements; }

    public void setMovements(List<MovementDto> movements) {
        this.movements = movements;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", currency='" + currency + '\'' +
                ", userDto=" + userDto +
                ", movements=" + movements +
                '}';
    }
}
