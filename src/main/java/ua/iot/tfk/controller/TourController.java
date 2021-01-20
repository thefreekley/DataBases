package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.Tour;
import ua.iot.tfk.service.TourService;

public class TourController extends AbstractController<Tour, Integer, TourService> {

    public TourController(){
        super(TourService.class);
    }
}
