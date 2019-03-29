package pl.michal.olszewski.inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity(name = "ProductPerClass")
@Table(name = "PROD")
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
