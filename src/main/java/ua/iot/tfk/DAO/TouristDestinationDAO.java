package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.TouristDestination;

public class TouristDestinationDAO extends BaseDAO<TouristDestination, Integer> {
    public TouristDestinationDAO(){
        super(TouristDestination.class);
    }
}

