package pl.michal.olszewski.zadania.zad8;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produkt {

  @Id
  @GeneratedValue
  private Long id;
  @Column(unique = true, nullable = false)
  private String name;
  @Column(nullable = false)
  private BigDecimal price;

  public Produkt() {
  }

  public Produkt(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }
}
