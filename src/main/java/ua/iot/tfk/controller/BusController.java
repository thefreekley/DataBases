package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.Bus;
import ua.iot.tfk.service.BusService;

public class BusController extends AbstractController<Bus, Integer, BusService> {

    public BusController(){
        super(BusService.class);
    }
}
