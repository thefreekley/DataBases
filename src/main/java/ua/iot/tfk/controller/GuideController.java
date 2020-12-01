package ua.iot.tfk.controller;

import ua.iot.tfk.model.entity.Guide;
import ua.iot.tfk.service.GuideService;

public class GuideController extends AbstractController<Guide, Integer, GuideService> {

    public GuideController(){
        super(GuideService.class);
    }
}
