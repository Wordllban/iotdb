package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.HotelDaoImpl;
import model.entities.HotelEntity;

public class HotelController extends AbstractGenericControllerImpl<HotelEntity>{
  private final HotelDaoImpl hotelDao = new HotelDaoImpl();

  @Override
  public AbstractGenericDaoImpl<HotelEntity> getDao(){
    return hotelDao;
  }

}
