package model.dao.impl;

import model.entities.UserEntity;

public class UserDaoImpl extends AbstractGenericDaoImpl<UserEntity>{
  public UserDaoImpl() {
    super(UserEntity.class);
  }
}
