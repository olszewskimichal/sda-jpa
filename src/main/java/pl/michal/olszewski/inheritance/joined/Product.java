package pl.michal.olszewski.inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "JOINED_PROD")
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
