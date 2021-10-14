package passive.controller.impl;

import passive.controller.Controller;
import passive.model.entities.HotelFeedbackEntity;
import passive.model.service.impl.HotelFeedbackServiceImpl;

public class HotelFeedbackControllerImpl extends AbstractController<HotelFeedbackEntity,Integer> implements Controller<HotelFeedbackEntity, Integer> {
  public HotelFeedbackControllerImpl() {
    super(new HotelFeedbackServiceImpl());
  }
}
