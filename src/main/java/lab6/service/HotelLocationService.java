package lab6.service;

import lab6.domain.HotelLocationEntity;
import lab6.repository.HotelLocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class HotelLocationService extends AbstractService<HotelLocationEntity, Integer>{
  public HotelLocationRepository hotelLocationRepository;

  @Override
  protected JpaRepository<HotelLocationEntity, Integer> getRepository() {
    return hotelLocationRepository;
  }
}
