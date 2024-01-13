package demo.models;

import java.util.Date;
import java.util.List;

public class Booking {

  private String bookingId;
  private Date bookingDate;
  private Member member;
  private Audi audi;
  private Show show;
  private BookingStatus bookingStatus;
  private double totalAmount;
  private List<Seat> seats;
  private Payment paymentDetails;

  public boolean makePayment() {
    return true;
  }
}
