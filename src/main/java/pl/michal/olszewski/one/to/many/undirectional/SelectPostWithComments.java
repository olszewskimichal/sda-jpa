package pl.michal.olszewski.one.to.many.undirectional;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class SelectPostWithComments {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        Post4 post = em.find(Post4.class, 22L);
        System.err.println(post);
    }
}
