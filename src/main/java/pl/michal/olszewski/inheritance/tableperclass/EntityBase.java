package pl.michal.olszewski.inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "BasePerClass")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class EntityBase {

  @Id
  @GeneratedValue
  private Long id;

  private String name;


  public EntityBase() {
  }

  public EntityBase(String name) {
    this.name = name;
  }


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
}
