package lab6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelRoomTypeDto {
  private Integer id;
  private String type;

  private Integer hotelRoomTypeCounter;
}
