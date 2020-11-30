package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;


@Table(name = "tour_has_guide")
public class TourHasGuide {

    @PrimaryKey
    @Column(name = "id_tour")
    private Integer idTour;


    @PrimaryKey
    @Column(name = "id_guide")
    private Integer idGuide;

    public TourHasGuide(){}

    public TourHasGuide(Integer idTour, Integer idGuide) {
        this.idTour = idTour;
        this.idGuide = idGuide;
    }

    @Override
    public String toString() {
        return "TourHasGuide{" +
                "idTour=" + idTour +
                ", idGuide=" + idGuide +
                '}';
    }
}
