package pl.michal.olszewski.materialy;

import pl.michal.EntityManagerCreator;

import javax.persistence.EntityManager;

public class MoviesUpdateDelete {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();
        entityManager.getTransaction().begin();

        int executeUpdate = entityManager.createQuery("UPDATE Movies m set m.name = ?1 where m.id <?2")
                .setParameter(1, "nowy film")
                .setParameter(2, 3L)
                .executeUpdate();
        System.out.println(executeUpdate);

        int deletedCount = entityManager.createQuery("DELETE from Movies m where m.id = ?1")
                .setParameter(1, 3L)
                .executeUpdate();
        System.out.println(deletedCount);

        entityManager.getTransaction().commit();
    }
}
