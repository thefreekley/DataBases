package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.Pedestrian;

public class PedestrianDAO extends BaseDAO<Pedestrian, Integer> {
    public PedestrianDAO(){
        super(Pedestrian.class);
    }
}

