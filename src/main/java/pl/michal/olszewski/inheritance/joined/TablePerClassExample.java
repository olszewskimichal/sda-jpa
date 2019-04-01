package pl.michal.olszewski.inheritance.joined;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import java.math.BigDecimal;
import javax.persistence.EntityManager;

public class TablePerClassExample {

  public static void main(String[] args) {
    EntityManager entityManager = INSTANCE.getEntityManager();
    entityManager.getTransaction().begin();

    entityManager.persist(new Product("name", BigDecimal.TEN));
    entityManager.getTransaction().commit();
  }
}
