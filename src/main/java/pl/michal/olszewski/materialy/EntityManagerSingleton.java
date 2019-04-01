package pl.michal.olszewski.materialy;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum EntityManagerSingleton {
  INSTANCE;
  private EntityManager entityManager;

  EntityManagerSingleton() {
    this.entityManager = Persistence
        .createEntityManagerFactory("test")
        .createEntityManager();
  }

  public EntityManager getEntityManager() {
    return entityManager;
  }
}
