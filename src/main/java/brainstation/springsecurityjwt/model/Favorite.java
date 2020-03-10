package brainstation.springsecurityjwt.model;

import brainstation.springsecurityjwt.dto.FavoriteDto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Favorite {
    private int id;
    private int userId;
    private int accountId;
    private int accountOwnerId;

    public Favorite() { }

    public Favorite(@JsonProperty("id") int id, @JsonProperty("userId") int userId, @JsonProperty("accountId") int accountId, @JsonProperty("accountOwnerId") int accountOwnerId) {
        this.id = id;
        this.userId = userId;
        this.accountId = accountId;
        this.accountOwnerId = accountOwnerId;
    }

    public Favorite(FavoriteDto favoriteDto){
        this.id = favoriteDto.getId();
        this.userId = favoriteDto.getUserId();
        this.accountId = favoriteDto.getAccountId();
        this.accountOwnerId = favoriteDto.getAccountOwnerId();
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

    public int getAccountOwnerId() {
        return accountOwnerId;
    }

    public void setAccountOwnerId(int accountOwnerId) {
        this.accountOwnerId = accountOwnerId;
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
