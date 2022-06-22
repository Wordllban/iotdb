package lab6.service;

import lab6.domain.HotelFeedbackEntity;
import lab6.repository.HotelFeedbackRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HotelFeedbackService extends AbstractService<HotelFeedbackEntity, Integer>{
  public HotelFeedbackRepository hotelFeedbackRepository;

  @Override
  protected JpaRepository<HotelFeedbackEntity, Integer> getRepository() {
    return hotelFeedbackRepository;
  }
}
