package pl.michal.olszewski.one.to.one.bidirectional.weak;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class InsertPostWithDetails {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        em.getTransaction().begin();

        Post2 post=new Post2();
        post.setTitle("title1");
        PostDetails2 details=new PostDetails2();
        details.setText("details1");
        details.setPost(post); //TODO co gdy tego braknie
        em.persist(details);
        post.setPostDetails2(details);
        em.persist(post);

        em.getTransaction().commit();
    }
}
