package pl.michal.olszewski.materialy.inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OTHERS")
class AnotherEntity extends EntityBase {

  public AnotherEntity(String name) {
    super(name);
  }
}
