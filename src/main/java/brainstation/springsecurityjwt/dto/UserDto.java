package brainstation.springsecurityjwt.dto;

import brainstation.springsecurityjwt.model.User;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "user")
public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String date;
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userDto")
    private List<MessageDto> messages;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userDto")
    private List<AccountDto> accounts;

    public UserDto(){}

    public UserDto(int id,
                String username,
                String password,
                String name,
                String lastname,
                String email,
                String phone,
                String date,
                String address,
                List<MessageDto> messages,
                List<AccountDto> accounts) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.address = address;
        this.messages = messages;
        this.accounts = accounts;
    }

    public UserDto(User user){
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.name = user.getName();
        this.lastname = user.getLastname();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.date = user.getDate();
        this.address = user.getAddress();
        this.messages = user.getMessages().stream().map(MessageDto::new).collect(Collectors.toList());
        this.accounts = user.getAccounts().stream().map(AccountDto::new).collect(Collectors.toList());
    }

    //List<Book> books = authorDTO.getPublishedBooks().stream().map(Book::new).collect(Collectors.toList());

//    public List<MessageDto> MessagesToMessagesDto(List<Message> messages){
//
//        if(!messages.isEmpty()){
//            List<MessageDto> list = new ArrayList<>();
//            for (Message m: messages){
//                MessageDto message = new MessageDto(m);
//                list.add(message);
//            }
//            return list;
//        }
//        return new ArrayList<>();
//    }
//
//    public List<AccountDto> AccountsToAccountsDto(List<Account> accounts){
//
//        if(!accounts.isEmpty()){
//            List<AccountDto> list = new ArrayList<>();
//            for(Account a: accounts){
//                AccountDto account = new AccountDto(a);
//                list.add(account);
//            }
//            return list;
//        }
//        return new ArrayList<>();
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MessageDto> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageDto> messages) {
        this.messages = messages;
    }

    public List<AccountDto> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountDto> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                ", messages=" + messages +
                ", accounts=" + accounts +
                '}';
    }
}
