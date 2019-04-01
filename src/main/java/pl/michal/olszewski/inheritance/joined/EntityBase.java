package pl.michal.olszewski.inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name = "JOINED_BASE")
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "JOINED_BASE")
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
