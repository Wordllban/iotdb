package passive.controller.impl;

import passive.controller.Controller;
import passive.model.entities.HotelRoomTypeEntity;
import passive.model.service.impl.HotelRoomTypeServiceImpl;

public class HotelRoomTypeControllerImpl extends AbstractController<HotelRoomTypeEntity,Integer> implements Controller<HotelRoomTypeEntity, Integer> {
  public HotelRoomTypeControllerImpl() {
    super(new HotelRoomTypeServiceImpl());
  }
}
