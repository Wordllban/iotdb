package passive.controller.impl;

import passive.controller.Controller;
import passive.model.entities.HotelRoomEntity;
import passive.model.service.impl.HotelRoomServiceImpl;

public class HotelRoomControllerImpl extends AbstractController<HotelRoomEntity,Integer> implements Controller<HotelRoomEntity, Integer> {
  public HotelRoomControllerImpl() {
    super(new HotelRoomServiceImpl());
  }
}
