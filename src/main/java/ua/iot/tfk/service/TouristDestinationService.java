package ua.iot.tfk.service;

import ua.iot.tfk.DAO.TouristDestinationDAO;
import ua.iot.tfk.model.entity.TouristDestination;

public class TouristDestinationService extends AbstractService<TouristDestination, Integer, TouristDestinationDAO> {
    public TouristDestinationService(){
        super(TouristDestinationDAO.class);
    }
}
