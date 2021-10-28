package controller.impl;

import model.dao.impl.AbstractGenericDaoImpl;
import model.dao.impl.UserDaoImpl;
import model.entities.UserEntity;

public class UserController extends AbstractGenericControllerImpl<UserEntity>{
  private final UserDaoImpl userDao = new UserDaoImpl();

  @Override
  public AbstractGenericDaoImpl<UserEntity> getDao(){
    return userDao;
  }

}