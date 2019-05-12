
package pl.michal.olszewski.materialy;

import pl.michal.EntityManagerCreator;
import pl.michal.Movies;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class MoviesSelectQuery {
    public static void main(String[] args) {

        EntityManager entityManager = EntityManagerCreator.getEntityManager();

        Query query = entityManager.createQuery("select m from Movies m");
        List resultList = query.getResultList();


        TypedQuery<Movies> typedQuery = entityManager
                .createQuery("select m from Movies m", Movies.class);

        List<Movies> resultList1 = typedQuery.getResultList();
       // System.out.println(resultList1);

        TypedQuery<Movies> typedQuery2 = entityManager
                .createQuery("select m from Movies m where id=4", Movies.class);
/* Movies singleResult = typedQuery2.getSingleResult();
        System.out.println(singleResult);*/

        List<Movies> resultList2 = typedQuery2.getResultList();
        if (resultList2.isEmpty()) System.err.println("Pusto");


        TypedQuery<String> query1 = entityManager
                .createQuery("select m.name from Movies m", String.class);
        query1.getResultList().forEach(System.out::println);


        TypedQuery<Movies> query2 = entityManager
                .createQuery("select m from Movies m where id = ?1", Movies.class);
        query2.setParameter(1,3L);
        List<Movies> resultList3 = query2.getResultList();
        System.out.println(resultList3);

        TypedQuery<Movies> query3 = entityManager
                .createQuery("select m from Movies m where id = :searchId", Movies.class);
        query3.setParameter("searchId",2L);
        List<Movies> resultList4 = query3.getResultList();
        System.out.println(resultList4);


        List<Movies> searchId = entityManager
                .createQuery("select m from Movies m where id = :searchId", Movies.class)
                .setParameter("searchId", 3L)
                .getResultList();
    }
}

