package passive.model.dao.Impl;

import passive.model.entities.UserEntity;

public class UserDaoImpl extends AbstractDaoImpl<UserEntity, Integer>{
  public UserDaoImpl() {
    super(UserEntity.class);
  }
}