package pl.michal.olszewski.materialy.ManyToMany;

import pl.michal.olszewski.materialy.EntityManagerSingleton;

import javax.persistence.EntityManager;

public class ManyToManyExample {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();

        entityManager.getTransaction().begin();

        ManyToManyPost post=new ManyToManyPost("title");

        post.addTag(new ManyToManyTag("tag"));
        post.addTag(new ManyToManyTag("tag2"));
        post.addTag(new ManyToManyTag("tag3"));

        entityManager.persist(post);


        entityManager.getTransaction().commit();
    }
}
