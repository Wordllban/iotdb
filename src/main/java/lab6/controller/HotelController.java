package lab6.controller;

import lab6.domain.HotelEntity;
import lab6.dto.HotelDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.HotelMapper;
import lab6.service.AbstractService;
import lab6.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/hotels")
@RestController
@AllArgsConstructor
public class HotelController extends AbstractController<HotelEntity, HotelDto, Integer> {
  private final HotelService hotelService;
  private final HotelMapper hotelMapper;

  @Override
  protected AbstractService<HotelEntity, Integer> getService() {
    return hotelService;
  }

  @Override
  protected AbstractMapper<HotelEntity, HotelDto> getMapper() {
    return hotelMapper;
  }
}
