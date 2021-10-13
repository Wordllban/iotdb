package passive.model.dao.impl;

import passive.model.entities.HotelEntity;

public class HotelDaoImpl extends AbstractDaoImpl<HotelEntity, Integer> {
  public HotelDaoImpl() {
    super(HotelEntity.class);
  }
}
