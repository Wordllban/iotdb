package passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "hotel_room_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class HotelRoomTypeEntity {
  @Id
  @Column(name = "id")
  private Integer id;
  @Column(name = "type", length = 45)
  private String type;
}
