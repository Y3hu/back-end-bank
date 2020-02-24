package brainstation.springsecurityjwt.model;

import brainstation.springsecurityjwt.dto.MessageDto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    private int id;
    private String detail;
    private String date;
    private User user;

    public Message(){}

    public Message(@JsonProperty("id") int id, @JsonProperty("detail") String detail, @JsonProperty("date") String date, @JsonProperty("user") User user) {
        this.id = id;
        this.detail = detail;
        this.date = date;
        this.user = user;
    }

    public Message(MessageDto messageDto) {
        this.id = messageDto.getId();
        this.detail = messageDto.getDetail();
        this.date = messageDto.getDate();
        this.user = new User(messageDto.getUser());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }
}
