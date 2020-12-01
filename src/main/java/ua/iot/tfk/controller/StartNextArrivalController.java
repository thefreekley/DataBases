package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.StartNextArrival;
import ua.iot.tfk.service.StartNextArrivalService;

public class StartNextArrivalController extends AbstractController<StartNextArrival, Integer, StartNextArrivalService> {

    public StartNextArrivalController(){
        super(StartNextArrivalService.class);
    }
}
