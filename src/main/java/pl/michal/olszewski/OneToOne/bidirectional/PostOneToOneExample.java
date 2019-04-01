package pl.michal.olszewski.OneToOne.bidirectional;

import javax.persistence.EntityManager;
import pl.michal.olszewski.EntityManagerSingleton;

public class PostOneToOneExample {

  public static void main(String[] args) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();

    entityManager.getTransaction().begin();

    //Zapisywanie
    PostBidirectional post21 = new PostBidirectional("post21");
    post21.setDetails(new PostDetailsBidirectional("content content"));
    entityManager.persist(post21);

    //wyciaganie z bazy
    PostDetailsBidirectional postDetailsBidirectional = entityManager.find(PostDetailsBidirectional.class, 1L);
    System.out.println(postDetailsBidirectional);
    System.out.println(postDetailsBidirectional.getPostBidirectional());

    entityManager.getTransaction().commit();
  }
}