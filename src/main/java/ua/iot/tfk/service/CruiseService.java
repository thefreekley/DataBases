package ua.iot.tfk.service;

import ua.iot.tfk.DAO.CruiseDAO;
import ua.iot.tfk.model.entity.Cruise;

public class CruiseService extends AbstractService<Cruise, Integer, CruiseDAO> {
    public CruiseService(){
        super(CruiseDAO.class);
    }
}
