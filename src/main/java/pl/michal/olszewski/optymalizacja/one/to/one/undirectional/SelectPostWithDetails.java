package pl.michal.olszewski.optymalizacja.one.to.one.undirectional;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class SelectPostWithDetails {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    Post post = em.find(Post.class, 8L);
    System.err.println(post);
  }
}
