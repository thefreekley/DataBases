package ua.iot.tfk.service;

import ua.iot.tfk.DAO.BusDAO;
import ua.iot.tfk.model.entity.Bus;

public class BusService extends AbstractService<Bus, Integer, BusDAO> {
    public BusService(){
        super(BusDAO.class);
    }
}
