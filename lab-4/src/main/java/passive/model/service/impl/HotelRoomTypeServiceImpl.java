package passive.model.service.impl;

import passive.model.dao.impl.HotelRoomTypeDaoImpl;
import passive.model.entities.HotelRoomTypeEntity;
import passive.model.service.Service;

public class HotelRoomTypeServiceImpl extends AbstractService<HotelRoomTypeEntity, Integer> implements Service<HotelRoomTypeEntity, Integer> {
  public HotelRoomTypeServiceImpl() {
    super(new HotelRoomTypeDaoImpl());
  }
}
