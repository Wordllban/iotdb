package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.HotelLocationDaoImpl;
import model.entities.HotelLocationEntity;

public class HotelLocationController extends AbstractGenericControllerImpl<HotelLocationEntity>{
  private final HotelLocationDaoImpl hotelLocationDao = new HotelLocationDaoImpl();

  @Override
  public AbstractGenericDaoImpl<HotelLocationEntity> getDao(){
    return hotelLocationDao;
  }

}