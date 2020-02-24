package brainstation.springsecurityjwt.model;

import brainstation.springsecurityjwt.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String date;
    private String address;
    private List<Message> messages;
    private List<Account> accounts;

    public User(){}

    public User(@JsonProperty("id") int id,
                @JsonProperty("username") String username,
                @JsonProperty("password") String password,
                @JsonProperty("name") String name,
                @JsonProperty("lastname") String lastname,
                @JsonProperty("email") String email,
                @JsonProperty("phone") String phone,
                @JsonProperty("date") String date,
                @JsonProperty("address") String address,
                @JsonProperty("messages") List<Message> messages,
                @JsonProperty("accounts") List<Account> accounts) {
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

    public User(UserDto userDto){
        this.id = userDto.getId();
        this.username = userDto.getUsername();
        this.password = userDto.getPassword();
        this.name = userDto.getName();
        this.lastname = userDto.getLastname();
        this.email = userDto.getEmail();
        this.phone = userDto.getPhone();
        this.date = userDto.getDate();
        this.address = userDto.getAddress();
    }

//    public List<Message> MessagesDtoToMessages(List<MessageDto> messages){
//        if(!messages.isEmpty()){
//            List<Message> list = new ArrayList<>();
//            for (MessageDto m: messages){
//                Message message = new Message(m);
//                list.add(message);
//            }
//            return list;
//        }
//        //List<Book> books = authorDTO.getPublishedBooks().stream().map(Book::new).collect(Collectors.toList());
//        return new ArrayList<>();
//    }
//
//    public List<Account> AccountsDtoToAccounts(List<AccountDto> accounts){
//        if(!accounts.isEmpty()){
//            List<Account> list = new ArrayList<>();
//            for(AccountDto a: accounts){
//                Account account = new Account(a);
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

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
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
        return "User{" +
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
                '}';
    }
}
