package lab6.controller;

import lab6.domain.BookingRecordEntity;
import lab6.dto.BookingRecordDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.BookingRecordMapper;
import lab6.service.AbstractService;
import lab6.service.BookingRecordService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/booking_records")
@RestController
@AllArgsConstructor
public class BookingRecordController extends AbstractController<BookingRecordEntity, BookingRecordDto, Integer>{
  private final BookingRecordService bookingRecordService;
  private final BookingRecordMapper bookingRecordMapper;

  @Override
  protected AbstractService<BookingRecordEntity, Integer> getService() {
    return bookingRecordService;
  }

  @Override
  protected AbstractMapper<BookingRecordEntity, BookingRecordDto> getMapper() {
    return bookingRecordMapper;
  }
}
