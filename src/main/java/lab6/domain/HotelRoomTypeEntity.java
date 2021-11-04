package lab6.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "hotel_room_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class HotelRoomTypeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "type", length = 45)
  private String type;

  @OneToMany(mappedBy = "hotelRoomTypeId", fetch = FetchType.EAGER)
  private Collection<HotelRoomEntity> hotelRoomTypes;

  public HotelRoomTypeEntity(Integer id, String type) {
    this.id = id;
    this.type = type;
  }

  @Override
  public String toString() {
    return "HotelRoomTypeEntity{" +
        "id=" + id +
        ", type='" + type + '\'' +
        '}' + "\n";
  }
}
