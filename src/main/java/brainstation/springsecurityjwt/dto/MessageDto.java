package brainstation.springsecurityjwt.dto;

import brainstation.springsecurityjwt.model.Message;

import javax.persistence.*;

@Entity(name = "message")
public class MessageDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    private String date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserDto userDto;

    public MessageDto(){}

    public MessageDto(int id, String detail, String date, UserDto userDto) {
        this.id = id;
        this.detail = detail;
        this.date = date;
        this.userDto = userDto;
    }

    public MessageDto(Message message){
        this.id = message.getId();
        this.detail = message.getDetail();
        this.date = message.getDate();
        this.userDto = new UserDto(message.getUser());
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

    public UserDto getUser() {
        return userDto;
    }

    public void setUser(UserDto userDto) {
        this.userDto = userDto;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", date='" + date + '\'' +
                ", user=" + userDto +
                '}';
    }
}
