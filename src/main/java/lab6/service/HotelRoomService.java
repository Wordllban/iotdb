package lab6.service;

import lab6.domain.HotelRoomEntity;
import lab6.repository.HotelRoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HotelRoomService extends AbstractService<HotelRoomEntity, Integer> {
  public HotelRoomRepository hotelRoomRepository;

  @Override
  protected JpaRepository<HotelRoomEntity, Integer> getRepository() {
    return hotelRoomRepository;
  }
}
