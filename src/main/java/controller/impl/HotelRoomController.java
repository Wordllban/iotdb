package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.HotelRoomDaoImpl;
import model.entities.HotelRoomEntity;

public class HotelRoomController extends AbstractGenericControllerImpl<HotelRoomEntity>{
  private final HotelRoomDaoImpl hotelRoomDao = new HotelRoomDaoImpl();

  @Override
  public AbstractGenericDaoImpl<HotelRoomEntity> getDao(){
    return hotelRoomDao;
  }

}