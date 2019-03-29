package pl.michal.olszewski.one.to.one.undirectional.unsaved;

import pl.michal.olszewski.one.to.one.undirectional.Post;
import pl.michal.olszewski.one.to.one.undirectional.PostDetails;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

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
