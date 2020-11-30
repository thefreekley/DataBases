package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;


@Table(name = "tourist")
public class Tourist {
    @PrimaryKey
    @Column(name = "id_tourist")
    private Integer idBus;

    @Column(name = "tourist_name")
    private String touristName;

    @Column(name = "tourist_age")
    private Integer touristAge;

    @Column(name = "tourist_num_phone")
    private String touristNumPhone;


    public Tourist(){}

    public Tourist( String touristName, Integer touristAge, String touristNumPhone) {
        this(-1, touristName,touristAge,touristNumPhone);
    }

    public Tourist(Integer idBus, String touristName, Integer touristAge, String touristNumPhone) {
        this.idBus = idBus;
        this.touristName = touristName;
        this.touristAge = touristAge;
        this.touristNumPhone = touristNumPhone;
    }

    public Integer getId() {
        return idBus;
    }

    public void setId(Integer idBus) {
        this.idBus = idBus;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public Integer getTouristAge() {
        return touristAge;
    }

    public void setTouristAge(Integer touristAge) {
        this.touristAge = touristAge;
    }

    public String getTouristNumPhone() {
        return touristNumPhone;
    }

    public void setTouristNumPhone(String touristNumPhone) {
        this.touristNumPhone = touristNumPhone;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "id=" + idBus +
                ", touristName='" + touristName + '\'' +
                ", touristAge=" + touristAge +
                ", touristNumPhone='" + touristNumPhone + '\'' +
                '}';
    }

}
