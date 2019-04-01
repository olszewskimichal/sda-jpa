package pl.michal.olszewski.pre;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class PreUpdateExample {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();

    em.getTransaction().begin();

    Car car = em.find(Car.class, 31L);
    car.setName("noWyCar");

    em.getTransaction().commit();
  }
}
