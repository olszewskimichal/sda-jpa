package pl.michal.olszewski.materialy;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    String street;
    String postCode;
    String city;

    public Address() {
    }

    public Address(String street, String postCode, String city) {
        this.street = street;
        this.postCode = postCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}