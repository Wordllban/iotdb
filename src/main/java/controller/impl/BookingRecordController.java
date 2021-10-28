package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.BookingRecordDaoImpl;
import model.entities.BookingRecordEntity;

public class BookingRecordController extends AbstractGenericControllerImpl<BookingRecordEntity>{
  private final BookingRecordDaoImpl bookingRecordDao = new BookingRecordDaoImpl();

  @Override
  public AbstractGenericDaoImpl<BookingRecordEntity> getDao(){
    return bookingRecordDao;
  }

}
