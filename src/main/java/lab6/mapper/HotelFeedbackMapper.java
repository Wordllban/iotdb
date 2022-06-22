package lab6.mapper;

import lab6.domain.HotelFeedbackEntity;
import lab6.dto.HotelFeedbackDto;
import org.springframework.stereotype.Component;

@Component
public class HotelFeedbackMapper extends AbstractMapper<HotelFeedbackEntity, HotelFeedbackDto> {

  @Override
  public HotelFeedbackDto mapObjectToDto(HotelFeedbackEntity hotelFeedbackEntity) {
    if (hotelFeedbackEntity == null)
      return null;

    HotelFeedbackDto.HotelFeedbackDtoBuilder hotelFeedbackDtoBuilder = HotelFeedbackDto.builder();
    hotelFeedbackDtoBuilder.id(hotelFeedbackEntity.getId());
    hotelFeedbackDtoBuilder.feedback(hotelFeedbackEntity.getFeedback());
    hotelFeedbackDtoBuilder.rating(hotelFeedbackEntity.getRating());

    return hotelFeedbackDtoBuilder.build();
  }
}
