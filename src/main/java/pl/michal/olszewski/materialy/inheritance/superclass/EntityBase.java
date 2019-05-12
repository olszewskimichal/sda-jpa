package pl.michal.olszewski.materialy.inheritance.superclass;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
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
