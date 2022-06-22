package lab6.repository;

import lab6.domain.HotelLocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelLocationRepository extends JpaRepository<HotelLocationEntity, Integer> {

}
