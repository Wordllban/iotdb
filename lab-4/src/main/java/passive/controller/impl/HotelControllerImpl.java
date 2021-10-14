package passive.controller.impl;

import passive.controller.Controller;
import passive.model.entities.HotelEntity;
import passive.model.service.impl.HotelServiceImpl;

public class HotelControllerImpl extends AbstractController<HotelEntity,Integer> implements Controller<HotelEntity, Integer> {
  public HotelControllerImpl() {
    super(new HotelServiceImpl());
  }
}
