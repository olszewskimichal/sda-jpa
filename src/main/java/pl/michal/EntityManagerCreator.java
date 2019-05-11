package pl.michal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerCreator {

    public static void main(String[] args) {
        EntityManager entityManager = getEntityManager();
    }

    public static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("test");
        return emf.createEntityManager();
    }
}
