package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;


@Table(name = "tour_has_stopping_point")
public class TourHasStoppingPoint {

    @PrimaryKey
    @Column(name = "id_tour")
    private Integer idTour;


    @PrimaryKey
    @Column(name = "id_stopping_point")
    private Integer idStoppingPoint;

    public TourHasStoppingPoint(){}

    public TourHasStoppingPoint(Integer idTour, Integer idStoppingPoint) {
        this.idTour = idTour;
        this.idStoppingPoint = idStoppingPoint;
    }

    public Integer getIdTour() {
        return idTour;
    }

    public void setIdTour(Integer idTour) {
        this.idTour = idTour;
    }

    public Integer getIdStoppingPoint() {
        return idStoppingPoint;
    }

    public void setIdStoppingPoint(Integer idStoppingPoint) {
        this.idStoppingPoint = idStoppingPoint;
    }

    @Override
    public String toString() {
        return "TourHasStoppingPoint{" +
                "idTour=" + idTour +
                ", idStoppingPoint=" + idStoppingPoint +
                '}';
    }
}
