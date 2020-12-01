package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.Bus;

public class BusDAO extends BaseDAO<Bus, Integer> {
    public BusDAO(){
        super(Bus.class);
    }
}

