package ua.iot.tfk.service;

import ua.iot.tfk.DAO.StoppingPointDAO;
import ua.iot.tfk.model.entity.StoppingPoint;

public class StoppingPointService extends AbstractService<StoppingPoint, Integer, StoppingPointDAO> {
    public StoppingPointService(){
        super(StoppingPointDAO.class);
    }
}
