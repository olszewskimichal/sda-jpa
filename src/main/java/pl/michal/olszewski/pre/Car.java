package pl.michal.olszewski.pre;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Car {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  private Date createdAt;

  private Date updatedAt;

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

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @PrePersist
  public void prePersist() {
    this.createdAt = new Date();
    this.updatedAt = new Date();
  }

  @PreUpdate
  public void preUpdate() {
    this.updatedAt = new Date();
  }
}
