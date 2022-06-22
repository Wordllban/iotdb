package lab6.mapper;

import lab6.domain.HotelEntity;
import lab6.dto.HotelDto;
import org.springframework.stereotype.Component;

@Component
public class HotelMapper extends AbstractMapper<HotelEntity, HotelDto>{


  @Override
  public HotelDto mapObjectToDto(HotelEntity hotelEntity) {
    if (hotelEntity == null)
      return null;

    HotelDto.HotelDtoBuilder hotelDtoBuilder = HotelDto.builder();
    hotelDtoBuilder.id(hotelEntity.getId());
    hotelDtoBuilder.hotel_name(hotelEntity.getHotel_name());
    hotelDtoBuilder.hotelRoomsCounter(hotelEntity.getHotelRooms().size());
    hotelDtoBuilder.bookingRecordsCounter(hotelEntity.getBookingRecords().size());

    return hotelDtoBuilder.build();
  }
}
