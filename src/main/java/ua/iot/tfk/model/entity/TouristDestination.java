package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;


@Table(name = "tourist_destination")
public class TouristDestination {

    @PrimaryKey
    @Column(name = "id_tourist_destination")
    private Integer idTouristDestination;

    @Column(name = "tourist_date")
    private String travelDate;

    @Column(name = "id_tourist")
    private Integer idTourist;

    @Column(name = "id_hotel")
    private Integer idHotel;

    @Column(name = "id_tour")
    private Integer idTour;

    public TouristDestination(){}

    public TouristDestination(String travelDate, Integer idTourist, Integer idHotel, Integer idTour) {
        this(-1,travelDate,idTourist,idHotel,idTour);
    }

    public TouristDestination(Integer idTouristDestination, String travelDate,
                              Integer idTourist, Integer idHotel, Integer idTour) {
        this.idTouristDestination = idTouristDestination;
        this.travelDate = travelDate;
        this.idTourist = idTourist;
        this.idHotel = idHotel;
        this.idTour = idTour;
    }

    public Integer getId() {
        return idTouristDestination;
    }

    public void setId(Integer idTouristDestination) {
        this.idTouristDestination = idTouristDestination;
    }


    @Override
    public String toString() {
        return "TouristDestination{" +
                "idTouristDestination=" + idTouristDestination +
                ", travelDate='" + travelDate + '\'' +
                ", idTourist=" + idTourist +
                ", idHotel='" + idHotel + '\'' +
                ", idTour='" + idTour + '\'' +
                '}';
    }
}
