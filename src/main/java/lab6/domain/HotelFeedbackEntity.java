package lab6.domain;

import lombok.*;

import javax.persistence.*;

@Table(name = "hotel_feedback")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class HotelFeedbackEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "feedback", length = 400)
  private String feedback;
  @Column(name = "rating")
  private Integer rating;
}
