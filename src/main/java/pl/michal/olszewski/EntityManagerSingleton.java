package pl.michal.olszewski;

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
