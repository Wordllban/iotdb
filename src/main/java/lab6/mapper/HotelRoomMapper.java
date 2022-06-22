package lab6.mapper;

import lab6.domain.HotelRoomEntity;
import lab6.dto.HotelRoomDto;
import org.springframework.stereotype.Component;

@Component
public class HotelRoomMapper extends AbstractMapper<HotelRoomEntity, HotelRoomDto> {

  @Override
  public HotelRoomDto mapObjectToDto(HotelRoomEntity hotelRoomEntity) {
    if (hotelRoomEntity == null)
      return null;

    HotelRoomDto.HotelRoomDtoBuilder hotelRoomDtoBuilder = HotelRoomDto.builder();
    hotelRoomDtoBuilder.id(hotelRoomEntity.getId());
    hotelRoomDtoBuilder.roomNumber(hotelRoomEntity.getRoomNumber());
    hotelRoomDtoBuilder.isBooked(hotelRoomEntity.getIsBooked());
    hotelRoomDtoBuilder.pricePerDay(hotelRoomEntity.getPricePerDay());
    hotelRoomDtoBuilder.hotelRoomTypeName(hotelRoomEntity.getHotelRoomTypeId().getType());
    hotelRoomDtoBuilder.hotelName(hotelRoomEntity.getHotelId().getHotel_name());

    return hotelRoomDtoBuilder.build();
  }
}
