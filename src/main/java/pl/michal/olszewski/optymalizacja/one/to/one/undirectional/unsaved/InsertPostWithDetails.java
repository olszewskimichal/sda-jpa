package pl.michal.olszewski.optymalizacja.one.to.one.undirectional.unsaved;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;
import pl.michal.olszewski.optymalizacja.one.to.one.undirectional.Post;
import pl.michal.olszewski.optymalizacja.one.to.one.undirectional.PostDetails;

public class InsertPostWithDetails {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    em.getTransaction().begin();

    Post post = new Post();
    post.setTitle("title1");
    PostDetails details = new PostDetails();
    details.setText("details1");
    post.setPostDetails(details);
    em.persist(post);

    em.getTransaction().commit();
  }
}
