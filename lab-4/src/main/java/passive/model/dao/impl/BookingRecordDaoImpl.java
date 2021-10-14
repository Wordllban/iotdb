package passive.model.dao.impl;

import passive.model.entities.BookingRecordEntity;

public class BookingRecordDaoImpl extends AbstractDaoImpl<BookingRecordEntity, Integer>{
  public BookingRecordDaoImpl() {
    super(BookingRecordEntity.class);
  }
}
