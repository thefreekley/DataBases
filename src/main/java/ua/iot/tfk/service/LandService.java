package ua.iot.tfk.service;

import ua.iot.tfk.DAO.LandDAO;
import ua.iot.tfk.model.entity.Land;

public class LandService extends AbstractService<Land, Integer, LandDAO> {
    public LandService(){
        super(LandDAO.class);
    }
}
