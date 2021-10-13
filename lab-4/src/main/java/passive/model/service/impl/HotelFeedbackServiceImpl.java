package passive.model.service.impl;

import passive.model.dao.impl.HotelFeedbackDaoImpl;
import passive.model.entities.HotelFeedbackEntity;
import passive.model.service.Service;

public class HotelFeedbackServiceImpl extends AbstractService<HotelFeedbackEntity, Integer> implements Service<HotelFeedbackEntity, Integer> {
  public HotelFeedbackServiceImpl() {
    super(new HotelFeedbackDaoImpl());
  }
}
