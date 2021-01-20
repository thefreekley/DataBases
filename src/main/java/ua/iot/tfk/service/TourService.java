package ua.iot.tfk.service;

import ua.iot.tfk.DAO.TourDAO;
import ua.iot.tfk.model.entity.Tour;

public class TourService extends AbstractService<Tour, Integer, TourDAO> {
    public TourService(){
        super(TourDAO.class);
    }
}
