package lab6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelRoomDto {
  private Integer id;
  private Integer roomNumber;
  private Byte isBooked;
  private Double pricePerDay;

  private String hotelRoomTypeName;
  private String hotelName;
}
