package pl.michal.olszewski.materialy.optymalizacja.one.to.many.undirectional.joinColumn;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class SelectPostWithComments {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    Post5 post = em.find(Post5.class, 25L);
    System.err.println(post);
  }
}
