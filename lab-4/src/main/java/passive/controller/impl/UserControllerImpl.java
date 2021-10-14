package passive.controller.impl;

import passive.controller.Controller;
import passive.model.entities.HotelRoomTypeEntity;
import passive.model.entities.UserEntity;
import passive.model.service.impl.UserServiceImpl;

public class UserControllerImpl extends AbstractController<UserEntity,Integer> implements Controller<UserEntity, Integer> {
  public UserControllerImpl() {
    super(new UserServiceImpl());
  }
}
