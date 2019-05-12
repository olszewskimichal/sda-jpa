package pl.michal.olszewski.materialy;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ParametrizedQueryExample {

  public static void main(String[] args) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();

    TypedQuery<Employee> query1 = entityManager
        .createQuery("select e from Employee e where e.name = ?1", Employee.class);
    query1.setParameter(1, "imie4");
    List<Employee> resultList1 = query1.getResultList();
    resultList1.stream()
        .forEach(employee -> System.out.println(employee));

    entityManager.createQuery("select e from Employee e where e.name = :employeeName", Employee.class)
        .setParameter("employeeName", "imie3")
        .getResultList()
        .stream()
        .forEach(employee -> System.out.println(employee));

  }

}
