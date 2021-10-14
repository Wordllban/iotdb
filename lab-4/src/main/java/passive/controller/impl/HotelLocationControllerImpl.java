package passive.controller.impl;

import passive.controller.Controller;
import passive.model.entities.HotelLocationEntity;
import passive.model.service.impl.HotelLocationServiceImpl;

public class HotelLocationControllerImpl extends AbstractController<HotelLocationEntity,Integer> implements Controller<HotelLocationEntity, Integer> {
  public HotelLocationControllerImpl() {
    super(new HotelLocationServiceImpl());
  }
}
