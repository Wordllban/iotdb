package passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "hotel_room")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class HotelRoomEntity {
  @Id
  @Column(name = "id")
  private Integer id;
  @Column(name = "room_number")
  private Integer roomNumber;
  @Column(name = "is_booked")
  private Byte isBooked;
  @Column(name = "price_per_day")
  private Double pricePerDay;
  @Column(name = "hotel_room_type_id")
  private Integer hotelRoomTypeId;
  @Column(name = "hotel_id")
  private Integer hotelId;
}
