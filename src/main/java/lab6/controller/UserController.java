package lab6.controller;

import lab6.domain.UserEntity;
import lab6.dto.UserDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.UserMapper;
import lab6.service.AbstractService;
import lab6.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/users")
@RestController
@AllArgsConstructor
public class UserController extends AbstractController<UserEntity, UserDto, Integer> {
  private final UserService userService;
  private final UserMapper userMapper;


  @Override
  protected AbstractService<UserEntity, Integer> getService() {
    return null;
  }

  @Override
  protected AbstractMapper<UserEntity, UserDto> getMapper() {
    return null;
  }
}
