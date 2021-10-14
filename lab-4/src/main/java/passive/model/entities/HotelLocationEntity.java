package passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "hotel_location")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class HotelLocationEntity {
  @Id
  @Column(name = "id")
  private Integer id;
  @Column(name = "country", length = 45)
  private String country;
  @Column(name = "city", length = 45)
  private String city;
  @Column(name = "street", length = 45)
  private String street;
}
