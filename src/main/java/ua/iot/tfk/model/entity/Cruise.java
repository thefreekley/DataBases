package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;


@Table(name = "cruise")
public class Cruise {
    @PrimaryKey
    @Column(name = "id_cruise")
    private Integer idCruise;

    @Column(name = "cruise_liner_name")
    private String cruiseLinerName;

    public Cruise() {
    }

    public Cruise(String cruiseLinerName){
        this(-1, cruiseLinerName);
    }

    public Cruise(Integer idCruise, String cruiseLinerName) {
        this.idCruise = idCruise;
        this.cruiseLinerName = cruiseLinerName;
    }

    public Integer getId() {
        return idCruise;
    }

    public void setId(Integer idCruise) {
        this.idCruise = idCruise;
    }

    public String getCruiseLinerName() {
        return cruiseLinerName;
    }

    public void setCruiseLinerName(String cruiseLinerName) {
        this.cruiseLinerName = cruiseLinerName;
    }


    @Override
    public String toString() {
        return "Cruise{" +
                "id=" + idCruise +
                ", cruiseLinerName='" + cruiseLinerName + '\'' +
                '}' + "\n";
    }

}
