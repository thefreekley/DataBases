package ua.iot.tfk.model.entity;


import javax.persistence.*;

@Entity(name = "StoppingPoint")
@Table(name = "stopping_point")
public class StoppingPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stopping_point")
    private Integer idStoppingPoint;

    @Column(name = "stopping_point_location")
    private String stoppingPointLocation;

    public StoppingPoint() { }

    public StoppingPoint(String stoppingPointLocation){
        this(-1, stoppingPointLocation);
    }

    public StoppingPoint(Integer idStoppingPoint, String stoppingPointLocation) {
        this.idStoppingPoint = idStoppingPoint;
        this.stoppingPointLocation = stoppingPointLocation;
    }

    public Integer getId() {
        return idStoppingPoint;
    }

    public void setId(Integer idStoppingPoint) {
        this.idStoppingPoint = idStoppingPoint;
    }

    public String getBusName() {
        return stoppingPointLocation;
    }

    public void setBusName(String stoppingPointLocation) {
        this.stoppingPointLocation = stoppingPointLocation;
    }


    @Override
    public String toString() {
        return "StoppingPoint{" +
                "id=" + idStoppingPoint +
                ", stoppingPointLocation='" + stoppingPointLocation + '\'' +
                '}' + "\n";
    }
}
