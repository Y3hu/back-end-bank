package brainstation.springsecurityjwt.model;

import brainstation.springsecurityjwt.dto.CardDto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Card {
    private int id;
    private int cardNumber;
    private String userName;
    private String expiration;
    private String entity;
    private int accountId;

    public Card(){}

    public Card(@JsonProperty("id") int id, @JsonProperty("cardNumber") int cardNumber, @JsonProperty("userName") String userName, @JsonProperty("expiration") String expiration, @JsonProperty("entity") String entity, @JsonProperty("accountId") int accountId) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.expiration = expiration;
        this.entity = entity;
        this.accountId = accountId;
    }

    public Card(CardDto cardDto){
        this.id = cardDto.getId();
        this.cardNumber = cardDto.getCardNumber();
        this.userName = cardDto.getUserName();
        this.expiration = cardDto.getExpiration();
        this.entity = cardDto.getEntity();
        this.accountId = cardDto.getAccountId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
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