package lab6.service;

import lab6.domain.HotelEntity;
import lab6.repository.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HotelService extends AbstractService<HotelEntity, Integer>{
  public HotelRepository hotelRepository;

  @Override
  protected JpaRepository<HotelEntity, Integer> getRepository() {
    return hotelRepository;
  }
}
