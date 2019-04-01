package pl.michal.olszewski.materialy.optymalizacja.one.to.many.undirectional;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class SelectPostWithComments {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    Post4 post = em.find(Post4.class, 22L);
    System.err.println(post);
  }
}
