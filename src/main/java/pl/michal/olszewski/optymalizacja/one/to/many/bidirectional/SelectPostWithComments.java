package pl.michal.olszewski.optymalizacja.one.to.many.bidirectional;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class SelectPostWithComments {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    Post6 post = em.find(Post6.class, 28L);
    System.err.println(post);
  }
}
