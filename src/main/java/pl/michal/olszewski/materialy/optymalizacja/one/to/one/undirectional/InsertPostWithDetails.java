package pl.michal.olszewski.materialy.optymalizacja.one.to.one.undirectional;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;

public class InsertPostWithDetails {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    em.getTransaction().begin();

    Post post = new Post();
    post.setTitle("title1");
    PostDetails details = new PostDetails();
    details.setText("details1");
    em.persist(details);
    post.setPostDetails(details);
    em.persist(post);

    em.getTransaction().commit();
  }
}
