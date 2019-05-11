package pl.michal;

import javax.persistence.EntityManager;

public class MoviesOperations {

    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();

        Movies movies = entityManager.find(Movies.class, 2L);

        entityManager.detach(movies);

        entityManager.getTransaction().begin();

        Movies merge = entityManager.merge(movies);

        movies.setName("Avengers Endgame2");

        System.out.println(movies);

        entityManager.getTransaction().commit();

    }

    public static void selectMovieById(EntityManager entityManager) {
        Movies movies = entityManager.find(Movies.class, 3L);
        System.out.println(movies);
    }
}
