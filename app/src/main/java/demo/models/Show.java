package demo.models;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {

  private int showId;
  private Movie movie;
  private Date startTime;
  private Date endTime;
  private CinemaHall cinemaHallAt;
  private Audi audiAt;
  private List<Seat> seatList;
}
