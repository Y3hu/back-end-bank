package brainstation.springsecurityjwt.dto;

import brainstation.springsecurityjwt.model.Favorite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "favorite")
public class FavoriteDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;
    private int accountId;

    public FavoriteDto(){}

    public FavoriteDto(int id, int userId, int accountId) {
        this.id = id;
        this.userId = userId;
        this.accountId = accountId;
    }

    public FavoriteDto(Favorite favorite){
        this.id = favorite.getId();
        this.userId = favorite.getUserId();
        this.accountId = favorite.getAccountId();
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
        return "FavoriteDto{" +
                "id=" + id +
                ", userId=" + userId +
                ", accountId=" + accountId +
                '}';
    }
}
