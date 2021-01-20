package ua.iot.tfk.service;

import ua.iot.tfk.DAO.CityDAO;
import ua.iot.tfk.model.entity.City;

public class CityService extends AbstractService<City, Integer, CityDAO> {
    public CityService(){
        super(CityDAO.class);
    }
}
