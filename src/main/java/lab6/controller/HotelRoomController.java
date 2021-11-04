package lab6.controller;

import lab6.domain.HotelRoomEntity;
import lab6.dto.HotelRoomDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.HotelRoomMapper;
import lab6.service.AbstractService;
import lab6.service.HotelRoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/hotel_rooms")
@RestController
@AllArgsConstructor
public class HotelRoomController extends AbstractController<HotelRoomEntity, HotelRoomDto, Integer> {
  private final HotelRoomService hotelRoomService;
  private final HotelRoomMapper hotelRoomMapper;

  @Override
  protected AbstractService<HotelRoomEntity, Integer> getService() {
    return null;
  }

  @Override
  protected AbstractMapper<HotelRoomEntity, HotelRoomDto> getMapper() {
    return null;
  }
}
