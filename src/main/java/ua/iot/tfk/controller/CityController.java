package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.City;
import ua.iot.tfk.service.CityService;

public class CityController extends AbstractController<City, Integer, CityService> {

    public CityController(){
        super(CityService.class);
    }
}
