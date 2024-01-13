package demo.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

  private int cityId;
  private String cityName;
  private List<CinemaHall> cinemaHalls;

  public List<CinemaHall> getCinemaHalls(String cityName) {
    return Collections.emptyList();
  }


}
