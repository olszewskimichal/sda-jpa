package pl.michal.olszewski.one.to.one.bidirectional.strong;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class SelectPostWithDetails {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        Post3 post = em.find(Post3.class, 20L);
        System.err.println(post);
    }
}
