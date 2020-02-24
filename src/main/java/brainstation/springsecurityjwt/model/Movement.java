package brainstation.springsecurityjwt.model;

import brainstation.springsecurityjwt.dto.MovementDto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Movement {
    private int id;
    private String detail;
    private String receptor;
    private String date;
    private String type;
    private String mount;
    private Account account;

    public Movement(){}

    public Movement(@JsonProperty("id") int id,
                    @JsonProperty("detail") String detail,
                    @JsonProperty("receptor") String receptor,
                    @JsonProperty("date") String date,
                    @JsonProperty("type") String type,
                    @JsonProperty("mount") String mount,
                    @JsonProperty("account") Account account) {
        this.id = id;
        this.detail = detail;
        this.receptor = receptor;
        this.date = date;
        this.type = type;
        this.mount = mount;
        this.account = account;
    }

    public Movement(MovementDto movementDto){
        this.id = movementDto.getId();
        this.detail = movementDto.getDetail();
        this.receptor = movementDto.getReceptor();
        this.date = movementDto.getDate();
        this.type = movementDto.getType();
        this.mount = movementDto.getMount();
        this.account = new Account(movementDto.getAccount());
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

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", receptor='" + receptor + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", mount='" + mount + '\'' +
                ", account=" + account +
                '}';
    }
}
