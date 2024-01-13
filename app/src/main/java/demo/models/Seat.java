package demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {

  private int seatId;
  private SeatType seatType;
  private SeatStatus seatStatus;
  private double price;
}
