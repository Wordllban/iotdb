package lab6.domain;

import lombok.*;

import javax.persistence.*;

@Table(name = "hotel_location")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class HotelLocationEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "country", length = 45)
  private String country;
  @Column(name = "city", length = 45)
  private String city;
  @Column(name = "street", length = 45)
  private String street;
}
