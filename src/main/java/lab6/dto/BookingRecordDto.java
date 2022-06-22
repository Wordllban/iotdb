package lab6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingRecordDto {
  private Integer id;
  private String reservationEndDate;
  private String reservationStartDate;
  private Byte isApprovedByMail;
  private Double price;

  private String hotelName;
  private String userName;
}
