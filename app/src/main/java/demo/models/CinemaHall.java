package demo.models;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaHall {

  private int cinemaId;
  private String cinemaHallName;
  private Address address;
  private List<Audi> audiList;

  public Map<Date, Movie> getMovies(List<Date> dateList) {
    return Collections.emptyMap();
  }

  public Map<Date, Show> getShows(List<Date> dateList) {
    return Collections.emptyMap();
  }

}
