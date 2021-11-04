package lab6.mapper;

import lab6.domain.BookingRecordEntity;
import lab6.dto.BookingRecordDto;
import org.springframework.stereotype.Component;

@Component
public class BookingRecordMapper extends AbstractMapper<BookingRecordEntity, BookingRecordDto> {

  @Override
  public BookingRecordDto mapObjectToDto(BookingRecordEntity bookingRecordEntity) {
    if (bookingRecordEntity == null)
        return null;

    BookingRecordDto.BookingRecordDtoBuilder bookingRecordDtoBuilder = BookingRecordDto.builder();
    bookingRecordDtoBuilder.id(bookingRecordEntity.getId());
    bookingRecordDtoBuilder.reservationEndDate(bookingRecordEntity.getReservationEndDate());
    bookingRecordDtoBuilder.reservationStartDate(bookingRecordEntity.getReservationStartDate());
    bookingRecordDtoBuilder.isApprovedByMail(bookingRecordEntity.getIsApprovedByMail());
    bookingRecordDtoBuilder.price(bookingRecordEntity.getPrice());
    bookingRecordDtoBuilder.hotelName(bookingRecordEntity.getHotelId().getHotel_name());
    bookingRecordDtoBuilder.userName(bookingRecordEntity.getUserId().getName());

    return bookingRecordDtoBuilder.build();
  }
}
