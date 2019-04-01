package pl.michal.olszewski.materialy.pre;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class PrePersistExample {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();

    em.getTransaction().begin();

    Car car = new Car();
    car.setName("name");
    em.persist(car);

    em.getTransaction().commit();
  }
}
