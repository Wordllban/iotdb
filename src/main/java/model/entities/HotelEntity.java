package model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "hotel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class HotelEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "hotel_name", length = 45)
  private String hotel_name;

  @OneToMany(mappedBy = "hotelId", fetch = FetchType.EAGER)
  private Collection<HotelRoomEntity> hotelRooms;
  @OneToMany(mappedBy = "hotelId", fetch = FetchType.LAZY)
  private Collection<BookingRecordEntity> bookingRecords;

  public HotelEntity(Integer id, String hotel_name) {
    this.id = id;
    this.hotel_name = hotel_name;
  }

  @Override
  public String toString() {
    return "HotelEntity{" +
        "id=" + id +
        ", hotel_name='" + hotel_name + '\'' +
        '}' + "\n";
  }
}
