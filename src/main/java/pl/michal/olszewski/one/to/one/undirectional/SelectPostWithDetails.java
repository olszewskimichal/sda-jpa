package pl.michal.olszewski.one.to.one.undirectional;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class SelectPostWithDetails {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        Post post = em.find(Post.class, 8L);
        System.err.println(post);
    }
}
