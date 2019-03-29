package pl.michal.olszewski.pre;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class PreUpdateExample {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();

        em.getTransaction().begin();

        Car car = em.find(Car.class, 31L);
        car.setName("noWyCar");

        em.getTransaction().commit();
    }
}
