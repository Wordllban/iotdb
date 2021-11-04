package lab6.repository;

import lab6.domain.HotelFeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelFeedbackRepository extends JpaRepository<HotelFeedbackEntity, Integer> {

}
