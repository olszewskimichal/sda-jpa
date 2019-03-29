package pl.michal.olszewski;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.List;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class QuerySelectEmployee {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();
        Query query = em.createQuery("select e from Employee e");
        List<Employee> resultList = query.getResultList();
        resultList.forEach(System.out::println);
    }
}
