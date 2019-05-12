package pl.michal.olszewski.materialy.optymalizacja.many.to.many.list;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class RemoveOneTagFromPost {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    em.getTransaction().begin();

    TaggedPost2 post1 = em.find(TaggedPost2.class, 41L);
    post1.removeTag(post1.getTags().get(0));

    em.getTransaction().commit();
  }
}
