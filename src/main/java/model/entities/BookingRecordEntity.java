package model.entities;


import lombok.*;

import javax.persistence.*;

@Table(name = "booking_record")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class BookingRecordEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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

  @ManyToOne
  @JoinColumn(name = "hotel_id", referencedColumnName = "id", nullable = false)
  private HotelEntity hotelId;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
  private UserEntity userId;
}
