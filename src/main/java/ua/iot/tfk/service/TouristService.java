package ua.iot.tfk.service;

import ua.iot.tfk.DAO.TouristDAO;
import ua.iot.tfk.model.entity.Tourist;

public class TouristService extends AbstractService<Tourist, Integer, TouristDAO> {
    public TouristService(){
        super(TouristDAO.class);
    }
}
