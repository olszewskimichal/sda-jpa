package pl.michal.olszewski.optymalizacja.many.to.many.set;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class InsertPostsWithTags {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    em.getTransaction().begin();

    TaggedPost post1 = new TaggedPost("JPA with Hibernate");
    TaggedPost post2 = new TaggedPost("Native Hibernate");

    Tag tag1 = new Tag("Java");
    Tag tag2 = new Tag("Hibernate");

    post1.addTag(tag1);
    post1.addTag(tag2);

    post2.addTag(tag1);

    em.persist(post1);
    em.persist(post2);

    em.getTransaction().commit();
  }
}
