package passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "hotel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class HotelEntity {
  @Id
  @Column(name = "id")
  private Integer id;
  @Column(name = "hotel_name", length = 45)
  private String hotel_name;
}
