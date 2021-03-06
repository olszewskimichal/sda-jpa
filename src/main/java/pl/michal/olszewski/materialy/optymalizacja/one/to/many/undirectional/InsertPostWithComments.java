package pl.michal.olszewski.materialy.optymalizacja.one.to.many.undirectional;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class InsertPostWithComments {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    em.getTransaction().begin();

    Post4 post = new Post4();
    post.setTitle("title1");
    PostComment4 comment = new PostComment4();
    comment.setReview("review1");
    post.getComments().add(comment);
    PostComment4 comment2 = new PostComment4();
    comment2.setReview("review2");
    post.getComments().add(comment2);
    em.persist(post);

    em.getTransaction().commit();
  }
}
