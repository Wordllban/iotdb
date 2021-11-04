package lab6.mapper;

import lab6.domain.HotelRoomTypeEntity;
import lab6.dto.HotelRoomDto;
import lab6.dto.HotelRoomTypeDto;
import org.springframework.stereotype.Component;

@Component
public class HotelRoomTypeMapper extends AbstractMapper<HotelRoomTypeEntity, HotelRoomTypeDto>{

  @Override
  public HotelRoomTypeDto mapObjectToDto(HotelRoomTypeEntity hotelRoomTypeEntity) {
    if (hotelRoomTypeEntity == null)
      return null;

    HotelRoomTypeDto.HotelRoomTypeDtoBuilder hotelRoomTypeDtoBuilder = HotelRoomTypeDto.builder();
    hotelRoomTypeDtoBuilder.id(hotelRoomTypeEntity.getId());
    hotelRoomTypeDtoBuilder.type(hotelRoomTypeEntity.getType());
    hotelRoomTypeDtoBuilder.hotelRoomTypeCounter(hotelRoomTypeEntity.getHotelRoomTypes().size());

    return hotelRoomTypeDtoBuilder.build();
  }
}
