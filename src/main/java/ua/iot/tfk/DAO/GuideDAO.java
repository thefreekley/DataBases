package ua.iot.tfk.DAO;

import ua.iot.tfk.model.entity.Guide;

public class GuideDAO extends BaseDAO<Guide, Integer> {
    public GuideDAO(){
        super(Guide.class);
    }
}

