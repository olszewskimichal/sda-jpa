package pl.michal.olszewski.inheritance.singletable;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class SingleTableExample {
    public static void main(String[] args) {
        EntityManager entityManager = INSTANCE.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(new Product("name", BigDecimal.TEN));
        entityManager.persist(new AnotherEntity("name"));
        entityManager.getTransaction().commit();
    }
}
