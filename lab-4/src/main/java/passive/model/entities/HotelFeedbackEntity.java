package passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "hotel_feedback")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class HotelFeedbackEntity {
  @Id
  @Column(name = "id")
  private Integer id;
  @Column(name = "feedback", length = 400)
  private String feedback;
  @Column(name = "rating")
  private Integer rating;
}
