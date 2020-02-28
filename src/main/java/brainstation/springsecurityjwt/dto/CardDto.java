package brainstation.springsecurityjwt.dto;

import brainstation.springsecurityjwt.model.Card;

import javax.persistence.*;

@Entity(name = "card")
public class CardDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cardNumber;
    private String userName;
    private String expiration;
    private String entity;
    private int accountId;

    public CardDto(){}

    public CardDto(int id, String cardNumber, String userName, String expiration, String entity, int accountId) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.expiration = expiration;
        this.entity = entity;
        this.accountId = accountId;
    }

    public CardDto(Card card){
        this.id = card.getId();
        this.cardNumber = card.getCardNumber();
        this.userName = card.getUserName();
        this.expiration = card.getExpiration();
        this.entity = card.getEntity();
        this.accountId = card.getAccountId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", userName='" + userName + '\'' +
                ", expiration='" + expiration + '\'' +
                ", entity='" + entity + '\'' +
                ", accountId=" + accountId +
                '}';
    }
}
