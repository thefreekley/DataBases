package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.StoppingPoint;
import ua.iot.tfk.service.StoppingPointService;

public class StoppingPointController extends AbstractController<StoppingPoint, Integer, StoppingPointService> {

    public StoppingPointController(){
        super(StoppingPointService.class);
    }
}
