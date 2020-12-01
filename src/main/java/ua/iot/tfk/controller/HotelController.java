package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.Hotel;
import ua.iot.tfk.service.HotelService;

public class HotelController extends AbstractController<Hotel, Integer, HotelService> {

    public HotelController(){
        super(HotelService.class);
    }
}
