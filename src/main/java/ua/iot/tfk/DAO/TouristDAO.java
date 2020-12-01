package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.Tourist;

public class TouristDAO extends BaseDAO<Tourist, Integer> {
    public TouristDAO(){
        super(Tourist.class);
    }
}

