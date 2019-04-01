package pl.michal.olszewski.materialy.optymalizacja.many.to.many.list;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class InsertPostsWithTags {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    em.getTransaction().begin();

    TaggedPost2 post1 = new TaggedPost2("JPA with Hibernate");
    TaggedPost2 post2 = new TaggedPost2("Native Hibernate");

    Tag2 tag1 = new Tag2("Java");
    Tag2 tag2 = new Tag2("Hibernate");

    post1.addTag(tag1);
    post1.addTag(tag2);

    post2.addTag(tag1);

    em.persist(post1);
    em.persist(post2);

    em.getTransaction().commit();
  }
}
