package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.HotelFeedbackDaoImpl;
import model.entities.HotelFeedbackEntity;

public class HotelFeedbackController extends AbstractGenericControllerImpl<HotelFeedbackEntity>{
  private final HotelFeedbackDaoImpl hotelFeedbackDao = new HotelFeedbackDaoImpl();

  @Override
  public AbstractGenericDaoImpl<HotelFeedbackEntity> getDao(){
    return hotelFeedbackDao;
  }

}
