package pl.michal.olszewski.one.to.many.bidirectional;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class InsertPostWithComments {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        em.getTransaction().begin();

        Post6 post=new Post6();
        post.setTitle("title1");
        PostComment6 comment=new PostComment6();
        comment.setReview("review1");
        comment.setPost(post);
        post.getComments().add(comment);
        PostComment6 comment2=new PostComment6();
        comment2.setPost(post);
        comment2.setReview("review2");
        post.getComments().add(comment2);
        em.persist(post);

        em.getTransaction().commit();
    }
}
