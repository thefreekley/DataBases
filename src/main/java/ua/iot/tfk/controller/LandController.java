package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.Land;
import ua.iot.tfk.service.LandService;

public class LandController extends AbstractController<Land, Integer, LandService> {

    public LandController(){
        super(LandService.class);
    }
}
