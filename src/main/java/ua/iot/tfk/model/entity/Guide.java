package ua.iot.tfk.model.entity;


import ua.iot.tfk.model.annotation.Column;
import ua.iot.tfk.model.annotation.PrimaryKey;
import ua.iot.tfk.model.annotation.Table;

import java.sql.Timestamp;


@Table(name = "guide")
public class Guide {
    @PrimaryKey
    @Column(name = "id_guide")
    private Integer idGuide;

    @Column(name = "guide_name")
    private String guideName;

    @Column(name = "guide_date_work")
    private Timestamp guideDateWork;

    @Column(name = "guide_num_phone")
    private String guideNumPhone;

    public Guide() {
    }

    public Guide(String guideName,Timestamp guideDateWork,String guideNumPhone  ){
        this(-1, guideName,guideDateWork,guideNumPhone);
    }

    public Guide(Integer idGuide, String guideName,Timestamp guideDateWork,String guideNumPhone) {
        this.idGuide = idGuide;
        this.guideName = guideName;
        this.guideDateWork=guideDateWork;
        this.guideNumPhone=guideNumPhone;
    }

    public Integer getId() {
        return idGuide;
    }

    public void setId(Integer idGuide) {
        this.idGuide = idGuide;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public Timestamp getGuideDateWork() {
        return guideDateWork;
    }

    public void setGuideDateWork(Timestamp guideDateWork) {
        this.guideDateWork = guideDateWork;
    }

    public String getGuideNumPhone() {
        return guideNumPhone;
    }

    public void setGuideNumPhone(String guideNumPhone) {
        this.guideNumPhone = guideNumPhone;
    }




    @Override
    public String toString() {
        return "Guide{" +
                "id=" + idGuide +
                ", guideDateWork=" + guideDateWork +
                ", guideNumPhone=" + guideNumPhone +
                ", guideName='" + guideName + '\'' +
                '}';
    }

}
