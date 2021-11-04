package lab6.controller;

import lab6.domain.HotelLocationEntity;
import lab6.dto.HotelLocationDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.HotelLocationMapper;
import lab6.service.AbstractService;
import lab6.service.HotelLocationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/hotel_locations")
@RestController
@AllArgsConstructor
public class HotelLocationController extends AbstractController<HotelLocationEntity, HotelLocationDto, Integer> {
  private final HotelLocationService hotelLocationService;
  private final HotelLocationMapper hotelLocationMapper;

  @Override
  protected AbstractService<HotelLocationEntity, Integer> getService() {
    return null;
  }

  @Override
  protected AbstractMapper<HotelLocationEntity, HotelLocationDto> getMapper() {
    return null;
  }
}
