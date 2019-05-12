package pl.michal.olszewski.materialy.optymalizacja.many.to.many.set;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class RemoveOneTagFromPost {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    em.getTransaction().begin();

    TaggedPost post1 = em.find(TaggedPost.class, 45L);
    post1.removeTag(post1.getTags().iterator().next());

    em.getTransaction().commit();
  }
}
