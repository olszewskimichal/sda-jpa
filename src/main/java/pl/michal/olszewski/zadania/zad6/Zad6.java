package pl.michal.olszewski.zadania.zad6;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum Zad6 {
  INSTANCE;
  private EntityManager entityManager;

  Zad6() {
    this.entityManager = Persistence
        .createEntityManagerFactory("test")
        .createEntityManager();
  }

  public EntityManager getEntityManager() {
    return entityManager;
  }
}
