package passive.model.service.impl;

import passive.model.dao.impl.HotelRoomDaoImpl;
import passive.model.entities.HotelRoomEntity;
import passive.model.service.Service;

public class HotelRoomServiceImpl extends AbstractService<HotelRoomEntity, Integer> implements Service<HotelRoomEntity, Integer> {
  public HotelRoomServiceImpl() {
    super(new HotelRoomDaoImpl());
  }
}
