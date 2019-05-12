package pl.michal.olszewski.materialy.inheritance.superclass;

import java.math.BigDecimal;
import javax.persistence.Entity;

@Entity
class Product extends EntityBase {

  private BigDecimal price;

  public Product(String name, BigDecimal price) {
    super(name);
    this.price = price;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
