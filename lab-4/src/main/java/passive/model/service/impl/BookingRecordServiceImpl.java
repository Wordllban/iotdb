package passive.model.service.impl;

import passive.model.dao.impl.BookingRecordDaoImpl;
import passive.model.entities.BookingRecordEntity;
import passive.model.service.Service;

public class BookingRecordServiceImpl extends AbstractService<BookingRecordEntity, Integer> implements Service<BookingRecordEntity, Integer> {
  public BookingRecordServiceImpl() {
    super(new BookingRecordDaoImpl());
  }
}
