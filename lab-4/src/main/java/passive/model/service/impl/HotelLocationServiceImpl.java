package passive.model.service.impl;

import passive.model.dao.impl.HotelLocationDaoImpl;
import passive.model.entities.HotelLocationEntity;
import passive.model.service.Service;

public class HotelLocationServiceImpl extends AbstractService<HotelLocationEntity, Integer> implements Service<HotelLocationEntity, Integer> {
  public HotelLocationServiceImpl() {
    super(new HotelLocationDaoImpl());
  }
}
