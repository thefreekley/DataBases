package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.City;

public class CityDAO extends BaseDAO<City, Integer> {
    public CityDAO(){
        super(City.class);
    }
}

