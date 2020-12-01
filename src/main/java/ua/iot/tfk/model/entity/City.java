package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;


@Table(name = "city")
public class City {
    @PrimaryKey
    @Column(name = "id_city")
    private Integer idCity;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "land_name")
    private String landName;

    public City() {
    }

    public City(String cityName,String landName){
        this(-1, cityName,landName);
    }

    public City(Integer idCity, String cityName,String landName) {
        this.idCity = idCity;
        this.cityName = cityName;
        this.landName = landName;
    }

    public Integer getId() {
        return idCity;
    }

    public void setId(Integer idCity) {
        this.idCity = idCity;
    }

    public String getBusName() {
        return cityName;
    }

    public void setBusName(String cityName) {
        this.cityName = cityName;
    }

    public String getLandName() {
        return landName;
    }

    public void setLandName(String landName) {
        this.landName = landName;
    }



    @Override
    public String toString() {
        return "Bus{" +
                "id=" + idCity +
                ", cityName='" + cityName  +
                ", landName='" + landName + '\'' +
                '}' + "\n";
    }

}
