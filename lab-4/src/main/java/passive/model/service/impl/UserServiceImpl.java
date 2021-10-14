package passive.model.service.impl;

import passive.model.dao.impl.UserDaoImpl;
import passive.model.entities.UserEntity;
import passive.model.service.Service;

public class UserServiceImpl extends AbstractService<UserEntity, Integer> implements Service<UserEntity, Integer> {
  public UserServiceImpl() {
    super(new UserDaoImpl());
  }
}
