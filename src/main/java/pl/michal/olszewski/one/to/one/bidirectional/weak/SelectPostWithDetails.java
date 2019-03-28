package pl.michal.olszewski.one.to.one.bidirectional.weak;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class SelectPostWithDetails {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        Post2 post = em.find(Post2.class, 20L);
        System.err.println(post);
    }
}
