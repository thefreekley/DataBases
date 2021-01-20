package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.Cruise;

public class CruiseDAO extends BaseDAO<Cruise, Integer> {
    public CruiseDAO(){
        super(Cruise.class);
    }
}

