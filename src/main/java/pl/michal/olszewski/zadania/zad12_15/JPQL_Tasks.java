package pl.michal.olszewski.zadania.zad12_15;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import pl.michal.olszewski.materialy.Employee;
import pl.michal.olszewski.materialy.EntityManagerSingleton;

public class JPQL_Tasks {

  public static void main(String[] args) {

  }

  static List<Employee> getAllEmployees() {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e", Employee.class);
    return query.getResultList();
  }

  static List<Employee> getAllEmployeesOrderByName() {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e order by e.name", Employee.class);
    return query.getResultList();
  }

  static List<Employee> getAllEmployeesWithSalaryBiggerThan2000() {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.salary>2000", Employee.class);
    return query.getResultList();
  }

  static List<Employee> getAllEmployeesNamesStartedWithA() {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    TypedQuery<Employee> query = entityManager.createQuery("select e.name from Employee e where e.name like 'a%'", Employee.class);
    return query.getResultList();
  }

}
