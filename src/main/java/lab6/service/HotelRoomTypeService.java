package lab6.service;

import lab6.domain.HotelRoomTypeEntity;
import lab6.repository.HotelRoomTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HotelRoomTypeService extends AbstractService<HotelRoomTypeEntity, Integer> {
  public HotelRoomTypeRepository hotelRoomTypeRepository;

  @Override
  protected JpaRepository<HotelRoomTypeEntity, Integer> getRepository() {
    return hotelRoomTypeRepository;
  }
}
