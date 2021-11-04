package lab6.controller;

import lab6.domain.HotelFeedbackEntity;
import lab6.dto.HotelFeedbackDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.HotelFeedbackMapper;
import lab6.service.AbstractService;
import lab6.service.HotelFeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/hotel_feedbacks")
@RestController
@AllArgsConstructor
public class HotelFeedbackController extends AbstractController<HotelFeedbackEntity, HotelFeedbackDto, Integer> {
  private final HotelFeedbackService hotelFeedbackService;
  private final HotelFeedbackMapper hotelFeedbackMapper;

  @Override
  protected AbstractService<HotelFeedbackEntity, Integer> getService() {
    return null;
  }

  @Override
  protected AbstractMapper<HotelFeedbackEntity, HotelFeedbackDto> getMapper() {
    return null;
  }
}
