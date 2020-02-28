package brainstation.springsecurityjwt.model;

import brainstation.springsecurityjwt.dto.FavoriteDto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Favorite {
    private int id;
    private int userId;
    private int accountId;

    public Favorite() { }

    public Favorite(@JsonProperty("id") int id, @JsonProperty("userId") int userId, @JsonProperty("accountId") int accountId) {
        this.id = id;
        this.userId = userId;
        this.accountId = accountId;
    }

    public Favorite(FavoriteDto favoriteDto){
        this.id = favoriteDto.getId();
        this.userId = favoriteDto.getUserId();
        this.accountId = favoriteDto.getAccountId();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "id=" + id +
                ", userId=" + userId +
                ", accountId=" + accountId +
                '}';
    }
}
