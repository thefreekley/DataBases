package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.Tourist;
import ua.iot.tfk.service.TouristService;

public class TouristController extends AbstractController<Tourist, Integer, TouristService> {

    public TouristController(){
        super(TouristService.class);
    }
}
