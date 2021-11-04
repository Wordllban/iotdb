package lab6.mapper;

import lab6.domain.UserEntity;
import lab6.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper  extends AbstractMapper<UserEntity, UserDto>{
  @Override
  public UserDto mapObjectToDto(UserEntity userEntity) {
    if (userEntity == null)
      return null;

    UserDto.UserDtoBuilder userDtoBuilder = UserDto.builder();
    userDtoBuilder.id(userEntity.getId());
    userDtoBuilder.name(userEntity.getName());
    userDtoBuilder.surname(userEntity.getSurname());
    userDtoBuilder.mail(userEntity.getMail());
    userDtoBuilder.userBankAccount(userEntity.getUserBankAccount());
    userDtoBuilder.bookingRecordsCounter(userEntity.getBookingRecords().size());

    return userDtoBuilder.build();
  }
}
