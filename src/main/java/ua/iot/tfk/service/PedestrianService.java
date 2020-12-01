package ua.iot.tfk.service;

import ua.iot.tfk.DAO.PedestrianDAO;
import ua.iot.tfk.model.entity.Pedestrian;

public class PedestrianService extends AbstractService<Pedestrian, Integer, PedestrianDAO> {
    public PedestrianService(){
        super(PedestrianDAO.class);
    }
}
