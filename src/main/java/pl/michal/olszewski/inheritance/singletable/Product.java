package pl.michal.olszewski.inheritance.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

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
