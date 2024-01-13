package demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  private int pinCode;
  private String street;
  private String city;
  private String state;
  private String country;

}
