package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.TouristDestination;
import ua.iot.tfk.service.TouristDestinationService;

public class TouristDestinationController extends AbstractController<TouristDestination, Integer, TouristDestinationService> {

    public TouristDestinationController(){
        super(TouristDestinationService.class);
    }
}
