package demo.models;

import java.util.Collections;
import java.util.List;

public class Member extends SystemMember {

  public Booking makeBooking(Booking booking) {
    return new Booking();
  }

  public List<Booking> getBooking() {
    return Collections.emptyList();
  }
}
