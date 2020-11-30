package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;


@Table(name = "pedestrian")
public class Pedestrian {
    @PrimaryKey
    @Column(name = "id_pedestrian")
    private Integer idPedestrian;

    @Column(name = "distance_KM")
    private Integer distanceKM;

    public Pedestrian() {
    }

    public Pedestrian(Integer distanceKM){
        this(-1, distanceKM);
    }

    public Pedestrian(Integer idPedestrian, Integer distanceKM) {
        this.idPedestrian = idPedestrian;
        this.distanceKM = distanceKM;
    }

    public Integer getId() {
        return idPedestrian;
    }

    public void setId(Integer id) {
        this.idPedestrian = idPedestrian;
    }

    public Integer getDistanceKM() {
        return distanceKM;
    }

    public void setDistanceKM(Integer distanceKM) {
        this.distanceKM = distanceKM;
    }


    @Override
    public String toString() {
        return "Pedestrian{" +
                "id=" + idPedestrian +
                ", distanceKM='" + distanceKM + '\'' +
                '}';
    }

}
