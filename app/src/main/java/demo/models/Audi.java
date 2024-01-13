package demo.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audi {

  private int audiId;
  private String audiName;
  private int totalSeats;
  private List<Show> showList;
}
