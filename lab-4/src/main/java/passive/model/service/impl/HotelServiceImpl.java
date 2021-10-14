package passive.model.service.impl;

import passive.model.dao.impl.HotelDaoImpl;
import passive.model.entities.HotelEntity;
import passive.model.service.Service;

public class HotelServiceImpl extends AbstractService<HotelEntity, Integer> implements Service<HotelEntity, Integer> {
  public HotelServiceImpl() {
    super(new HotelDaoImpl());
  }
}
