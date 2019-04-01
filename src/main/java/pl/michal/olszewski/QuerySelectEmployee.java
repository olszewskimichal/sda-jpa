package pl.michal.olszewski;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class QuerySelectEmployee {

  public static void main(String[] args) {
    EntityManager em = INSTANCE.getEntityManager();
    TypedQuery<Employee> query = em.createQuery("select e from Employee e", Employee.class);
    List<Employee> resultList = query.getResultList();
    resultList.forEach(System.out::println);
  }
}
