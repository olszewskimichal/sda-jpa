package pl.michal.olszewski.many.to.many.set;

import javax.persistence.EntityManager;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class RemoveOneTagFromPost {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        em.getTransaction().begin();

        TaggedPost post1 = em.find(TaggedPost.class, 30L);
        post1.removeTag(post1.getTags().iterator().next());

        em.getTransaction().commit();
    }
}
