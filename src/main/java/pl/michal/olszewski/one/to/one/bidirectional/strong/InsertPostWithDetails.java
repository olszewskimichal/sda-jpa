package pl.michal.olszewski.one.to.one.bidirectional.strong;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class InsertPostWithDetails {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        em.getTransaction().begin();

        Post3 post=new Post3();
        post.setTitle("title1");
        PostDetails3 details=new PostDetails3();
        details.setText("details1");
        details.setPost(post); //TODO co gdy tego braknie
        em.persist(details);
        post.setPostDetails3(details);
        em.persist(post);

        em.getTransaction().commit();
    }
}
