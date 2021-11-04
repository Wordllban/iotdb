package lab6.repository;

import lab6.domain.HotelRoomTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRoomTypeRepository extends JpaRepository<HotelRoomTypeEntity, Integer> {

}
