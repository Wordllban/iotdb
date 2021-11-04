package lab6.mapper;

import lab6.domain.HotelLocationEntity;
import lab6.dto.HotelLocationDto;
import org.springframework.stereotype.Component;

@Component
public class HotelLocationMapper extends AbstractMapper<HotelLocationEntity, HotelLocationDto>{
  @Override
  public HotelLocationDto mapObjectToDto(HotelLocationEntity hotelLocationEntity) {
    if (hotelLocationEntity == null)
      return null;

    HotelLocationDto.HotelLocationDtoBuilder hotelLocationDtoBuilder = HotelLocationDto.builder();
    hotelLocationDtoBuilder.id(hotelLocationEntity.getId());
    hotelLocationDtoBuilder.country(hotelLocationEntity.getCountry());
    hotelLocationDtoBuilder.city(hotelLocationEntity.getCity());
    hotelLocationDtoBuilder.street(hotelLocationEntity.getStreet());

    return hotelLocationDtoBuilder.build();
  }
}
