package pl.michal.olszewski;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class TypedQuerySelectEmployee {
    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();

        TypedQuery<Employee> query = em.createQuery("select e from Employee e", Employee.class);
        List<Employee> resultList = query.getResultList();
        resultList.forEach(System.out::println);
    }
}
