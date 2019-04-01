package pl.michal.olszewski.materialy.optymalizacja.one.to.many.undirectional.joinColumn;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

public class InsertPostWithComments {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        em.getTransaction().begin();

        Post5 post = new Post5();
        post.setTitle("title1");
        PostComment5 comment = new PostComment5();
        comment.setReview("review1");
        post.getComments().add(comment);
        PostComment5 comment2 = new PostComment5();
        comment2.setReview("review2");
        post.getComments().add(comment2);
        em.persist(post);

        em.getTransaction().commit();
    }
}
