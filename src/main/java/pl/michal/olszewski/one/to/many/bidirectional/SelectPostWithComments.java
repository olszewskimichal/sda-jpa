package pl.michal.olszewski.one.to.many.bidirectional;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class SelectPostWithComments {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        Post6 post = em.find(Post6.class, 28L);
        System.err.println(post);
    }
}
