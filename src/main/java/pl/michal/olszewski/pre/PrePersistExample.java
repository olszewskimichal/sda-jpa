package pl.michal.olszewski.pre;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

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
