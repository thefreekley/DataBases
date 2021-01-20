package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.Cruise;
import ua.iot.tfk.service.CruiseService;

public class CruiseController extends AbstractController<Cruise, Integer, CruiseService> {

    public CruiseController(){
        super(CruiseService.class);
    }
}
