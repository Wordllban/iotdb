package passive.controller.impl;

import passive.controller.Controller;
import passive.model.entities.BookingRecordEntity;
import passive.model.service.impl.BookingRecordServiceImpl;

public class BookingRecordControllerImpl extends AbstractController<BookingRecordEntity,Integer> implements Controller<BookingRecordEntity, Integer> {
  public BookingRecordControllerImpl() {
    super(new BookingRecordServiceImpl());
  }
}
