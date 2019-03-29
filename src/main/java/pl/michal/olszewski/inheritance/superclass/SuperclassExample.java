package pl.michal.olszewski.inheritance.superclass;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class SuperclassExample {
    public static void main(String[] args) {
        EntityManager entityManager = INSTANCE.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(new Product("name", BigDecimal.TEN));
        entityManager.getTransaction().commit();
    }
}
