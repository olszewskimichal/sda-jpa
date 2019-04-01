package pl.michal.olszewski.inheritance.singletable;

import java.math.BigDecimal;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "ProductSingle")
@DiscriminatorValue("prod")
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
