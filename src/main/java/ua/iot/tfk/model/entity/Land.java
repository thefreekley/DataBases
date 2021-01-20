package ua.iot.tfk.model.entity;


import javax.persistence.*;


@Entity(name = "Land")
@Table(name = "land")
public class Land {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
