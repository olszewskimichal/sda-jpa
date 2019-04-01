package pl.michal.olszewski.OneToOne.undirectional;

import javax.persistence.EntityManager;
import pl.michal.olszewski.EntityManagerSingleton;

public class PostOneToOneExample {

  public static void main(String[] args) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();

    entityManager.getTransaction().begin();

    PostUnidirectional postUnidirectional1 = new PostUnidirectional("postUnidirectional1");
    postUnidirectional1.setDetails(new PostDetailsUnidirectional("content content"));

    entityManager.persist(postUnidirectional1);

    entityManager.getTransaction().commit();
  }
}