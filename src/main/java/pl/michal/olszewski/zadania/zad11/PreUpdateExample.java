package pl.michal.olszewski.zadania.zad11;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class PreUpdateExample {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();

    em.getTransaction().begin();

    User user = em.find(User.class, 31L);
    user.setName("noWyCar");

    em.getTransaction().commit();
  }
}
