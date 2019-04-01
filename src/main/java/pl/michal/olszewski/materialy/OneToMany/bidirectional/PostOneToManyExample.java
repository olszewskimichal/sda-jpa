package pl.michal.olszewski.materialy.OneToMany.bidirectional;

import javax.persistence.EntityManager;
import pl.michal.olszewski.materialy.EntityManagerSingleton;

public class PostOneToManyExample {

  public static void main(String[] args) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();

    entityManager.getTransaction().begin();
    Post2Bidirectional post = new Post2Bidirectional("First post");
    post.getComments().add(
        new PostCommentBidirectional("My first review")
    );
    post.getComments().add(
        new PostCommentBidirectional("My second review")
    );
    post.getComments().add(
        new PostCommentBidirectional("My third review")
    );
    entityManager.persist(post);

    entityManager.getTransaction().commit();
  }

}
