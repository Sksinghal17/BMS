package demo.models;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
  private double amount;
  private Date paymentDate;
  private int transactionId;
  private PaymentStatus paymentStatus;
}
