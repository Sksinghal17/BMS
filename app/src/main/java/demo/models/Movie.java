package demo.models;

import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

  private int movieId;
  private String name;
  private Integer durationInMins;
  private Genre genre;
  private Language language;
  private Date releaseDate;
  Map<String, List<Show>> cityShowMap;

}
