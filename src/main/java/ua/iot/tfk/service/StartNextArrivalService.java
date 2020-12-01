package ua.iot.tfk.service;

import ua.iot.tfk.DAO.StartNextArrivalDAO;
import ua.iot.tfk.model.entity.StartNextArrival;

public class StartNextArrivalService extends AbstractService<StartNextArrival, Integer, StartNextArrivalDAO> {
    public StartNextArrivalService(){
        super(StartNextArrivalDAO.class);
    }
}
