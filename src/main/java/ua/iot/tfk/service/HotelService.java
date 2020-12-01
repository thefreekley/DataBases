package ua.iot.tfk.service;

import ua.iot.tfk.DAO.HotelDAO;
import ua.iot.tfk.model.entity.Hotel;

public class HotelService extends AbstractService<Hotel, Integer, HotelDAO> {
    public HotelService(){
        super(HotelDAO.class);
    }
}
