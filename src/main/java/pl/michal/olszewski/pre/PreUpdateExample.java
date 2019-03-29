package pl.michal.olszewski.pre;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class PreUpdateExample {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();

        em.getTransaction().begin();

        em.find(Car.class, 44L);

        em.getTransaction().commit();
    }
}
