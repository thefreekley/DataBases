package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;


@Table(name = "land")
public class Land {
    @PrimaryKey
    @Column(name = "land_name")
    private String landName;

    public Land() { }

    public Land(String landName) {
        this.landName = landName;
    }

    public String getId() {
        return landName;
    }

    public void setId(String landName) {
        this.landName = landName;
    }



    @Override
    public String toString() {
        return "Land{" +
                "landName=" + landName +
                '}' + "\n";
    }

}
