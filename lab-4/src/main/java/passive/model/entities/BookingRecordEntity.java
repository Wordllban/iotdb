package passive.model.entities;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "booking_record")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class BookingRecordEntity {
  @Id
  @Column(name = "id")
  private Integer id;
  @Column(name = "reservation_end_date", length = 10)
  private String reservationEndDate;
  @Column(name = "reservation_start_date", length = 10)
  private String reservationStartDate;
  @Column(name = "is_approved_by_mail")
  private Byte isApprovedByMail;
  @Column(name = "price")
  private Double price;
  @Column(name = "hotel_id")
  private Integer hotelId;
  @Column(name = "user_id")
  private Integer userId;
}
