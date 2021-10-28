package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.HotelRoomTypeDaoImpl;
import model.entities.HotelRoomTypeEntity;

public class HotelRoomTypeController extends AbstractGenericControllerImpl<HotelRoomTypeEntity>{
  private final HotelRoomTypeDaoImpl hotelRoomTypeDao = new HotelRoomTypeDaoImpl();

  @Override
  public AbstractGenericDaoImpl<HotelRoomTypeEntity> getDao(){
    return hotelRoomTypeDao;
  }

}