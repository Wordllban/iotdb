package lab6.repository;

import lab6.domain.BookingRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRecordRepository extends JpaRepository<BookingRecordEntity, Integer> {

}
