package pl.michal.olszewski.optymalizacja.one.to.many.undirectional.joinColumn;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class SelectPostWithComments {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        Post5 post = em.find(Post5.class, 25L);
        System.err.println(post);
    }
}
