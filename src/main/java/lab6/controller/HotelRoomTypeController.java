package lab6.controller;

import lab6.domain.HotelRoomTypeEntity;
import lab6.dto.HotelRoomTypeDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.HotelRoomTypeMapper;
import lab6.service.AbstractService;
import lab6.service.HotelRoomTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/hotel_room_types")
@RestController
@AllArgsConstructor
public class HotelRoomTypeController extends AbstractController<HotelRoomTypeEntity, HotelRoomTypeDto, Integer> {
  private final HotelRoomTypeService hotelRoomTypeService;
  private final HotelRoomTypeMapper hotelRoomTypeMapper;

  @Override
  protected AbstractService<HotelRoomTypeEntity, Integer> getService() {
    return null;
  }

  @Override
  protected AbstractMapper<HotelRoomTypeEntity, HotelRoomTypeDto> getMapper() {
    return null;
  }
}
