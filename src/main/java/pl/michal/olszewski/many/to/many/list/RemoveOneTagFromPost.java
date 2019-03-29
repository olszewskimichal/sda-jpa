package pl.michal.olszewski.many.to.many.list;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class RemoveOneTagFromPost {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        em.getTransaction().begin();

        TaggedPost2 post1 = em.find(TaggedPost2.class, 30L);
        post1.removeTag(post1.getTags().get(0));

        em.getTransaction().commit();
    }
}
