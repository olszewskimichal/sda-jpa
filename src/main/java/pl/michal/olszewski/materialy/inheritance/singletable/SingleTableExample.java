package pl.michal.olszewski.materialy.inheritance.singletable;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import java.math.BigDecimal;
import javax.persistence.EntityManager;

public class SingleTableExample {

  public static void main(String[] args) {
    EntityManager entityManager = INSTANCE.getEntityManager();
    entityManager.getTransaction().begin();

    entityManager.persist(new Product("name", BigDecimal.TEN));
    entityManager.persist(new AnotherEntity("name"));
    entityManager.getTransaction().commit();
  }
}
