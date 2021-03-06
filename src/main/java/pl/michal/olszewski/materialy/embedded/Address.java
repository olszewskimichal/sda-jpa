package pl.michal.olszewski.materialy.embedded;

import com.sun.istack.NotNull;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

  @NotNull
  private String city;

  private String street;

  @NotNull
  private String zipCode;

  public Address() {

  }

  public Address(String city, String street, String zipCode) {
    this.city = city;
    this.street = street;
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
}