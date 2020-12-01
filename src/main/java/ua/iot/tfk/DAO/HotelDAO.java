package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.Hotel;

public class HotelDAO extends BaseDAO<Hotel, Integer> {
    public HotelDAO(){
        super(Hotel.class);
    }
}

