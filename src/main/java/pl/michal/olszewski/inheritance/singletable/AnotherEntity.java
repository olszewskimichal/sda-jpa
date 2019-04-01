package pl.michal.olszewski.inheritance.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "AnotherEntitySingle")
@DiscriminatorValue("other")
class AnotherEntity extends EntityBase {

  public AnotherEntity(String name) {
    super(name);
  }
}
