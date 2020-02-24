package brainstation.springsecurityjwt.dto;

import brainstation.springsecurityjwt.model.Movement;

import javax.persistence.*;

@Entity(name = "movement")
public class MovementDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    private String receptor;
    private String date;
    private String type;
    private String mount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private AccountDto accountDto;

    public MovementDto(){}

    public MovementDto(int id,
                    String detail,
                    String receptor,
                    String date,
                    String type,
                    String mount,
                    AccountDto accountDto) {
        this.id = id;
        this.detail = detail;
        this.receptor = receptor;
        this.date = date;
        this.type = type;
        this.mount = mount;
        this.accountDto = accountDto;
    }

    public MovementDto(Movement movement){
        this.id = movement.getId();
        this.detail = movement.getDetail();
        this.receptor = movement.getReceptor();
        this.date = movement.getDate();
        this.type = movement.getType();
        this.mount = movement.getMount();
        this.accountDto = new AccountDto(movement.getAccount());
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

    public AccountDto getAccount() {
        return accountDto;
    }

    public void setAccount(AccountDto accountDto) {
        this.accountDto = accountDto;
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
                ", account=" + accountDto +
                '}';
    }
}
