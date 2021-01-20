package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.StoppingPoint;

public class StoppingPointDAO extends BaseDAO<StoppingPoint, Integer> {
    public StoppingPointDAO(){
        super(StoppingPoint.class);
    }
}

