package passive.model.dao.Impl;

import passive.model.entities.HotelEntity;

public class HotelDaoImpl extends AbstractDaoImpl<HotelEntity, Integer> {
  public HotelDaoImpl() {
    super(HotelEntity.class);
  }
}
