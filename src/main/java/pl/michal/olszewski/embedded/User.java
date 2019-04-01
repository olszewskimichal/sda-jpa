package pl.michal.olszewski.embedded;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

  @GeneratedValue
  @Id
  private Long id;

  private String name;

  @Embedded
  @AttributeOverrides(value = {
      @AttributeOverride(name = "city", column = @Column(name = "contact_city")),
      @AttributeOverride(name = "street", column = @Column(name = "contact_street")),
      @AttributeOverride(name = "zipCode", column = @Column(name = "contact_zipCode"))

  })
  private Address contactAddress;

  @Embedded
  private Address livingAddress;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getContactAddress() {
    return contactAddress;
  }

  public void setContactAddress(Address contactAddress) {
    this.contactAddress = contactAddress;
  }

  public Address getLivingAddress() {
    return livingAddress;
  }

  public void setLivingAddress(Address livingAddress) {
    this.livingAddress = livingAddress;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", contactAddress=" + contactAddress +
        ", livingAddress=" + livingAddress +
        '}';
  }
}
