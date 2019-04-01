package pl.michal.olszewski.OneToMany.undirectional;

import javax.persistence.EntityManager;
import pl.michal.olszewski.EntityManagerSingleton;

public class PostOneToManyExample {

  public static void main(String[] args) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();

    entityManager.getTransaction().begin();
    Post2Unidirectional post = new Post2Unidirectional("First post");
    post.getComments().add(
        new PostCommentUndirectional("My first review")
    );
    post.getComments().add(
        new PostCommentUndirectional("My second review")
    );
    post.getComments().add(
        new PostCommentUndirectional("My third review")
    );
    entityManager.persist(post);

    entityManager.getTransaction().commit();
  }

}
