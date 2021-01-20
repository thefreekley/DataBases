package ua.iot.tfk.model.entity;


import javax.persistence.*;

@Entity(name = "TourHasGuide")
@Table(name = "tour_has_guide")
public class TourHasGuide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tour")
    private Integer idTour;


    @Column(name = "id_guide")
    private Integer idGuide;

    public TourHasGuide(){}

    public TourHasGuide(Integer idGuide){
        this(-1, idGuide);
    }



    public TourHasGuide(Integer idTour, Integer idGuide) {
        this.idTour = idTour;
        this.idGuide = idGuide;
    }

    @Override
    public String toString() {
        return "TourHasGuide{" +
                "idTour=" + idTour +
                ", idGuide=" + idGuide +
                '}' + "\n";
    }
}
