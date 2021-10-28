package model.entities;

import lombok.*;

import javax.persistence.*;

@Table(name = "hotel_room")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class HotelRoomEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "room_number")
  private Integer roomNumber;
  @Column(name = "is_booked")
  private Byte isBooked;
  @Column(name = "price_per_day")
  private Double pricePerDay;

  @ManyToOne
  @JoinColumn(name = "hotel_room_type_id", referencedColumnName = "id", nullable = false)
  private HotelRoomTypeEntity hotelRoomTypeId;
  @ManyToOne
  @JoinColumn(name = "hotel_id", referencedColumnName = "id", nullable = false)
  private HotelEntity hotelId;
}
