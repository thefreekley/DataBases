package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.Pedestrian;
import ua.iot.tfk.service.PedestrianService;

public class PedestrianController extends AbstractController<Pedestrian, Integer, PedestrianService> {

    public PedestrianController(){
        super(PedestrianService.class);
    }
}
