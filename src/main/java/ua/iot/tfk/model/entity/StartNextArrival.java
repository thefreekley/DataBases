package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;
import java.sql.Timestamp;

@Table(name = "start_next_arrival")
public class StartNextArrival {

  @PrimaryKey
  @Column(name = "id_stopping_point")
  private Integer idStartNextArrival;

  @Column(name = "start_next_arrival_date")
  private Timestamp startNextArrivalDate;

  @Column(name = "id_tour")
  private Integer idTour;

  public StartNextArrival() { }

  public StartNextArrival(Timestamp startNextArrivalDate, Integer idTour) {
    this(-1,startNextArrivalDate,idTour);
  }

  public StartNextArrival(Integer idStartNextArrival, Timestamp startNextArrivalDate, Integer idTour) {
    this.idStartNextArrival = idStartNextArrival;
    this.startNextArrivalDate = startNextArrivalDate;
    this.idTour = idTour;
  }

  public Integer getId() {
    return idStartNextArrival;
  }

  public void setId(Integer idStartNextArrival) {
    this.idStartNextArrival = idStartNextArrival;
  }

  public Timestamp getStartNextArrivalDate() {
    return startNextArrivalDate;
  }

  public void setStartNextArrivalDate(Timestamp startNextArrivalDate) {
    this.startNextArrivalDate = startNextArrivalDate;
  }

  public Integer getIdTour() {
    return idTour;
  }

  public void setIdTour(Integer idTour) {
    this.idTour = idTour;
  }

  @Override
  public String toString() {
    return "StartNextArrival{" +
            "idStartNextArrival=" + idStartNextArrival +
            ", startNextArrivalDate=" + startNextArrivalDate +
            ", idTour=" + idTour +
            '}';
  }
}



