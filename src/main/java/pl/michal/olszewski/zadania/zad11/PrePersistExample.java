package pl.michal.olszewski.zadania.zad11;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class PrePersistExample {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();

    em.getTransaction().begin();

    User user = new User();
    user.setName("name");
    em.persist(user);

    em.getTransaction().commit();
  }
}
