package pl.michal.olszewski.materialy.optymalizacja.one.to.one.bidirectional.strong;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class SelectPostWithDetails {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    Post3 post = em.find(Post3.class, 20L);
    System.err.println(post);
  }
}
