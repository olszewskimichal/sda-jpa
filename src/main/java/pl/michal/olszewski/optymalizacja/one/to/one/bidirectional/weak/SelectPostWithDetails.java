package pl.michal.olszewski.optymalizacja.one.to.one.bidirectional.weak;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class SelectPostWithDetails {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    Post2 post = em.find(Post2.class, 20L);
    System.err.println(post);
  }
}
