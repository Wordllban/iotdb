package lab6.service;

import lab6.domain.BookingRecordEntity;
import lab6.repository.BookingRecordRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookingRecordService extends AbstractService<BookingRecordEntity, Integer> {
  public BookingRecordRepository bookingRecordRepository;

  @Override
  protected JpaRepository<BookingRecordEntity, Integer> getRepository() {
    return bookingRecordRepository;
  }
}
