package pl.michal;

import javax.persistence.EntityManager;

public class MoviesPersists {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();

        entityManager.getTransaction().begin();

        Movies movie = new Movies("Avengers3", 2019);
        entityManager.persist(movie);

        entityManager.getTransaction().commit();
    }
}
