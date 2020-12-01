package ua.iot.tfk.service;

import ua.iot.tfk.DAO.GuideDAO;
import ua.iot.tfk.model.entity.Guide;

public class GuideService extends AbstractService<Guide, Integer, GuideDAO> {
    public GuideService(){
        super(GuideDAO.class);
    }
}
